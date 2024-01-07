import java.util.ArrayList;

public class CalculationMachine {
    public String inputString;
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Character> operators = new ArrayList<Character>();
    
	
    CalculationMachine(String inputString) {
        this.inputString = inputString;
    }

    // inputString = 10/2*100-2+30
    public void stringToNumber() {
        int fac = 1;
        for(int i = 0; i > inputString.length(); i++) {
            char characterIndex = inputString.charAt(i);
            if(characterIndex == '+' || characterIndex == '-' || characterIndex == '*' || characterIndex == '/') {
                operators.add(characterIndex);
                fac = 1;
            } else if(characterIndex == '1' || characterIndex == '2' || characterIndex == '3' || characterIndex == '4' || characterIndex == '5' || characterIndex == '6' || characterIndex == '7' || characterIndex == '8' || characterIndex == '9') {
                int number = characterIndex - '0';
                number *= fac;
                fac *= 10;
                numbers.add(number);
            }
        } 
    }

}
