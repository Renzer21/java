package Employees;

public class ParttimeEmployee extends Employee {
 int OTHrs;

public ParttimeEmployee(String name, double salary, int OTHrs) {
	super(name, salary);
	this.OTHrs = OTHrs;
}
void displayEmplnfo() {
	System.out.println("name :"+this.name);
	System.out.println("salary :"+this.salary);
	System.out.println("OT hours :"+this.OTHrs);

}
}
