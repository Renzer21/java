package vehical2;

public class main {
  public static void main(String[] args) {
	Car car1 = new Car("tesle",500.00,4);
	motorcycle moto1 = new motorcycle("susuki",600.00,5);
	
	System.out.println("the total cost of the "+car1.calculateRentalCost(10));
	System.out.println("the total cost of the "+moto1.calculateRentalCost(10));
}
}
