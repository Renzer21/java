package vehical2;

public class motorcycle extends Vehicle{
int engineCapacity;

public motorcycle(String model, double rentelPricePerDay,int engineCapacity) {
	super(model,rentelPricePerDay);
	this.engineCapacity = engineCapacity;
}

}
