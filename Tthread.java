package multithreading;
class employee extends Thread {
	
	public void run() {
		//Thread th=Thread.currentThread();
			System.out.println(getName() +" " +getPriority());	
		}
		void display() {
			System.out.println("Bye1..");
		}
}
class employee1 extends Thread {
	
	public void run() {
		//Thread th=Thread.currentThread();
			System.out.println(getName() +" " +getPriority());	
		}
		void display() {
			System.out.println("Bye2..");
		}
}
public class Tthread {

	public static void main(String[] args) throws InterruptedException {
		employee t=new employee();
		employee1 t1=new employee1();
		t.setName("Kumar");
		t.start();
		t1.setPriority(1);
		t1.start();
		t1.join();
		t1.display();
		t.join();
		t.display();
		System.out.println("Bye3..");
		

	}

}
