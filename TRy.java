package multithreading;

import java.util.Scanner;

public class TRy {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		try {
			a=s.nextInt();
			b=s.nextInt();
			a=a+b;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
	}

}
