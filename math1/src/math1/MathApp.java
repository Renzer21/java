package math1;

public class MathApp {
	  public static void main(String[] args) {
	    MathOperations mathOperations = new MathOperations();
	    mathOperations.drawMultiplicationTable(5, 10); // prints the multiplication table of 5 up to 10
	    int result = mathOperations.factorial();
	    System.out.println("The factorial is: " + result);
	  }
	}

