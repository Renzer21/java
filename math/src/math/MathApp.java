package math;

import java.util.Scanner;

public class MathApp {
public static void main(String[] args) {
	int num1;
	int num2;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	num1 = sc.nextInt();
	
	System.out.println("Enter the range :");
	num2 = sc.nextInt();
	
	
	MathOperations mo = new MathOperations();
	mo.drawMultiplicationTable(num1, num2);
	
	if(mo.factorial()==0) {
		System.out.println("You have an invalid number");
	}
	else {
		System.out.println(mo.factorial());
	}
}
}
