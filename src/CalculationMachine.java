import java.util.ArrayList;

public class CalculationMachine {
    public String inputString;
    private boolean lastDigitTest = true;
    ArrayList<Float> numbers = new ArrayList<Float>();
    ArrayList<Character> operators = new ArrayList<Character>();
    
	
    CalculationMachine(String inputString) {
        this.inputString = inputString;
    }

    public void stringToNumber() {
        float number = 0;
        float fac = 10;
        float fac2 = 1;
        boolean decimal = false;

        if(inputString.isEmpty()) {
            return;
        }

        for(int i = 0; i < inputString.length(); i++) {
            char characterIndex = inputString.charAt(i);

            if(characterIndex >= '0' && characterIndex <= '9') {
                number = (number * fac) + ((characterIndex - '0') * fac2);
                if(decimal) {
                    fac2 *= 0.1f;
                }

                //Debug
                //System.out.println("Zahl gespeichert" + number);

            } else if(characterIndex == '.') {
                decimal = true;
                fac = 1;
                fac2 = 0.1f;

                //Debug
                //System.out.println("decimal true");

            } else if((characterIndex == '+' || characterIndex == '-' || characterIndex == '*' || characterIndex == '/') && i != inputString.length() - 1) {
                char operator = characterIndex;
                decimal = false;
                fac = 10;
                fac2 = 1;
                numbers.add(number);
                number = 0;
                operators.add(operator);

                //Debug
                //System.out.println("operator saved");
            } else if((characterIndex == '+' || characterIndex == '-' || characterIndex == '*' || characterIndex == '/') && i == inputString.length() - 1){
                char operator = characterIndex;
                decimal = false;
                fac = 10;
                fac2 = 1;
                numbers.add(number);
                number = 0;
                operators.add(operator);
                lastDigitTest = false;
            }
        }
        if(lastDigitTest) {
            numbers.add(number);
        }
        
        //Debug
        //System.out.println("letzte zahl");
    }

    public String calculateFloat() {

        stringToNumber();
        //DebugMethod
        //listArray();

        if(operators.isEmpty() && numbers.isEmpty()) {
            return "Please insert a calculation!";
        }

        if(numbers.isEmpty() && !operators.isEmpty() || !lastDigitTest) {
            return "Please insert a complete calculation!";
        }
        if(numbers.size() == 1 && operators.isEmpty()) {
            return "The solution is: " + numbers.get(0);
        }

        while(!operators.isEmpty()) {
            for(int i = 0; i < operators.size(); i++) {
                if(operators.get(i) == '*') {
                    float temp = numbers.get(i) * numbers.get(i + 1);
                    numbers.set(i, temp);
                    numbers.remove(i + 1);
                    operators.remove(i);

                } else if(operators.get(i) == '/') {
                    if(numbers.get(i + 1) != 0) {
                        float temp = numbers.get(i) / numbers.get(i + 1);
                        numbers.set(i, temp);
                        numbers.remove(i + 1);
                        operators.remove(i);
                    } else {
                       return "Please dont divide with zero!";
                    }
                }    
            }
            for(int i = 0; i < operators.size(); i++) {
                if(operators.get(i) == '+') {
                    float temp = numbers.get(i) + numbers.get(i + 1);
                    numbers.set(i, temp);
                    numbers.remove(i + 1);
                    operators.remove(i);
                } else if(operators.get(i) == '-') {
                    float temp = numbers.get(i) - numbers.get(i + 1);
                    numbers.set(i, temp);
                    numbers.remove(i + 1);
                    operators.remove(i);
                }    
            }
        }

        return "The solution is: " + numbers.get(0);
    }
    //Debug method to display the content of the Arraylists in console
    public void listArray() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for (int i = 0; i < operators.size(); i++) {
            System.out.println(operators.get(i));
        }    
    }
}
