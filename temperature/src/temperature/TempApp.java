package temperature;

import java.util.Scanner;
public class TempApp {
	
	public static void main(String[] args) {
		
	double celsius,Fahrenheit;

	TemperatureConverter t1=new TemperatureConverter();
	TemperatureConverter t2=new TemperatureConverter();
	Scanner myscanner = new Scanner(System.in);
	
	System.out.println("Enter the Temperature in celsius ");
	 celsius =myscanner.nextDouble();
	
	System.out.println("Enter the Temperature in farenheit ");
	Fahrenheit =myscanner.nextDouble();
	
	System.out.println("celsius is equal to "+t1.celsiusToFahrenheit(celsius)+"F");
	System.out.println("farenheit is equal to "+t2.farenheitToCelsius(Fahrenheit)+"C");
}
}