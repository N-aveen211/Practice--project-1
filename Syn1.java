package multithreading;
class Threadd{
	synchronized void display() {
		Thread th3=Thread.currentThread();
		for(int i=0;i<5;i++) {
			System.out.println(th3.getName());
			
		}
	}
}
class naveen extends Thread{
	Threadd m1;
	naveen(Threadd m){
		this.m1=m;
	}
	public void run() {
		m1.display();
	}
}
class Threaad1 extends Thread{
	Threadd m2;
	Threaad1(Threadd m){
		this .m2=m;
	}
	public void run() {
		m2.display();
	}
}
public class Syn1 {

	public static void main(String[] args) {
        Threadd th=new Threadd();
        naveen th1=new naveen(th);
        Threaad1 th2=new Threaad1(th);
       th1.start();
        th2.start();
	}

}
