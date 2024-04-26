package vehical2;

public class Vehicle {
  String model;
  double rentelPricePerDay;
public Vehicle(String model, double rentelPricePerDay) {
	
	this.model = model;
	this.rentelPricePerDay = rentelPricePerDay;
}
  public double calculateRentalCost(int days) {
	  double rent;
	  rent= rentelPricePerDay*days;
	  
	  return rent;
  }
}
