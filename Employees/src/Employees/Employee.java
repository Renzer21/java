package Employees;

public class Employee {
String name;
double salary;
public Employee(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}
     void displayInfo(){
	System.out.println("name :"+this.name);
	System.out.println("salary :"+this.salary);
}
}
