package onlinetest;

public class TemperatureConverter {
double temperature;

public TemperatureConverter() {
	this.temperature=0;
}

public double getTemperature() {
	return temperature;
}

public double celsiusToFahrenheit(double Celcius) {
	return Celcius *(9/5)+32;
}
public double FaranhiteToCelcius(double Faranhite) {
	return (Faranhite-32)*5/9;
}
}
