package hello;

public class ThreadDemo {
	public static void main(String[] args) {

		TestThread testThread = new TestThread();
		testThread.start();

		for (int i = 0; i < 10; i++) {
		System.out.println("perent"+i);
	}
}
}