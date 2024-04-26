package onlinetest;

import java.util.Scanner;

public class tempApp {

	public static void main(String[] args) {
		double Celsius, Fahrenheit;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter celstem:");
		Celsius = sc.nextDouble();
		System.out.println("Enter farenheit:");
		Fahrenheit = sc.nextDouble();

		TemperatureConverter tc1 = new TemperatureConverter();
		TemperatureConverter tc2 = new TemperatureConverter();

		System.out.println(Celsius + " Celsius is equal " + tc1.celsiusToFahrenheit(Celsius) + " farenheight");
		System.out.println(Fahrenheit + " Fahrenheit is equal " + tc2.FaranhiteToCelcius(Fahrenheit) + " Celsius");
	}
}
