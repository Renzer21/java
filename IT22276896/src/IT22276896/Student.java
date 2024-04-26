package IT22276896;

public class Student {
String name;
int age;
public Student(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}


public int getAge() {
	return age;
}



public void displayInfo() {
	System.out.println("name :"+this.name);
	System.out.println("age :"+this.age);
}
}
