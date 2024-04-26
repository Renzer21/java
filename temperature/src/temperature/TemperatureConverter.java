package temperature;

public class TemperatureConverter {
	double temperature;

	public TemperatureConverter() {
		this.temperature = 0;

	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;

	}

	public double farenheitToCelsius(double farenheit) {
		return (farenheit - 32) * 5 / 9;
	}
}
