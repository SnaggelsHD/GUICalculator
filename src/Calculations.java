public class Calculations implements CalculationsInterface {
	public int x;
	public int y;
	public char operator;
    public String inputString;
	
    Calculations(String inputString) {
        this.inputString = inputString;
    }

    // inputString = 10/2*100-2+30
    
    
    public int calculate() {
        switch (operator) {
            case '+':
                return x + y;
                break;
            case '-':
                return x - y;
                break;
            case '*':
                return x * y;
                break;
            case '/':
                return x / y;
                break;
        }
    }

    public float displayText() {
        return x;
    }
}
