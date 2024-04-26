package IT22276896;

public class COurse extends Student{
String courseName;

public COurse(String name, int age, String courseName) {
	super(name, age);
	this.courseName = courseName;
}
public void displayCourseInfo() {
	System.out.println("name:"+this.name );
	System.out.println("age:"+this.age );
	System.out.println("courseName :"+this.courseName );
}

}
