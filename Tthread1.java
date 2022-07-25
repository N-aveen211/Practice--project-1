package multithreading;

import java.util.Scanner;

class Threaad extends Thread{
	int c=10,b=5;
	public void run() {
		try {
			c=b/c;
			sleep(1000);
			System.out.print("Hello''''");
		} catch (Exception e) {
			System.out.println("No");
		}	
}
}
class Threaad2 extends Thread{
	int a,b;
	Threaad2(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void run(){
		if(a>b) {
			try {
				System.out.println("Hello");
				wait(1000);
				System.out.println(a);	
			} catch (Exception e) {}
		}
		else {
			System.out.print(b);
		}
	}
	
}
public class Tthread1 extends Thread {

	public static void main(String[] args) {
		Scanner S1=new Scanner(System.in);
		int a,b;
		a=S1.nextInt();
		b=S1.nextInt();
		Threaad th =new Threaad();
		Threaad2 th1 =new Threaad2(a,b);
		th.start();
		th1.start();

	}

}
