package vehical2;

public class Car extends Vehicle{
int numSeats;

public Car(String model, double rentelPricePerDay,int numSeats) {
	super(model,rentelPricePerDay);
	this.numSeats = numSeats;
}



}
