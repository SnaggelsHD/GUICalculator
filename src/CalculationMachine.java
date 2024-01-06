public class CalculationMachine {
	public float x;
	public float y;
	public char operator;
    public String inputString;
    public String inputStringCopy;
    public float solution;
    
	
    CalculationMachine(String inputString) {
        this.inputString = inputString;
    }

    // inputString = 10/2*100-2+30
    public void stringToNumber() {
        /*for(int i = 0; i > inputString.length(); i++) {
            inputStringCopy = inputString.substring(0, 1);
            inputString = inputString.substring(1 , inputString.length() - 1);
            System.out.println(inputStringCopy);
        }*/
    }

    
    public float calculate() {
        switch (operator) {
            case '+':
                solution = x + y;
            case '-':
                solution = x - y;
            case '*':
                solution = x * y;
            case '/':
                solution = x / y;
        }
        return solution;
    }

    public float displayText() {
        return x;
    }
}
