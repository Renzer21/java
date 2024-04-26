package lab3;

public class Test {
	public static void main(String[] args) {
		Student se1 = new Student();
		se1.name = "kamal"; 
		se1.ditno = "It123";
		se1.address = "colambo";
		Student se2 = new Student();
		se2.name = "amal";
		se2.ditno = "it890";
		se2.address = "kandy";
		
		System.out.println("name is "+se1.name+" Dit no "+ se1.ditno );
	}
}
