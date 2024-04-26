package math;

import java.util.Iterator;
import java.util.Scanner;

public class MathOperations {
	
	int number,range;
	
    public void drawMultiplicationTable(int number,int range) {
    	for (int i = 0; i < range; i++) {
			System.out.println(i+1+"X"+number+ "="+ (i+1)+"number");
		}
    }
    

public int factorial() {
	int num1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	num1 =sc.nextInt();
	
	int k;
	
	if (num1>0) {
		k=1;
		
		for (int j = 1; j <num1 ; j++) {
			k*=j;
		}
		return k;
	}
	else {
		return 0;
	}
}
}