package multithreading;
import java.util.Scanner;
class age 
{
	int a,b,c;
	age(int a,int b){
		this.a=a;
		this.b=b;
	}
	void add() throws ArithmeticException{
		c=a/b;
		System.out.println(c);
	}
	void age1(int d) {
		if(18<d) {
			System.out.println("Eligible");
		}
		else {
			throw new ArithmeticException("No Eligible");
		}
	}
	
}
public class Trycatch {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
           int a,b;
           a=s.nextInt();
		   b=s.nextInt();
		   int d = s.nextInt();
		   age ag=new age(a ,b);
		  
          try {
			ag.add();
		} catch (ArithmeticException e) {
			System.out.println("Enter crt valuue");
		} 
          finally {
        	  System.out.println("Bye...");
          }
          ag.age1(d);
	}
	     

}
