package math1;

import java.util.Scanner;

public class Factorial {
	public int factorial() {
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter a positive integer: ");
		  int n = scanner.nextInt();
		  int factorial = 1;
		  for (int i = 1; i <= n; i++) {
		    factorial *= i;
		  }
		  return factorial;
		}

}
