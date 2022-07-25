package multithreading;

import java.util.Scanner;

public class Trycatch1 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a,b;
		 a=s.nextInt();
		 b=s.nextInt();
		try {
			int c= a/b;
			System.out.println(c);
		}
        catch(Exception e) {
        	System.out.println("Enter crt value");
        }
		finally {
			System.out.println("Completed....");
		}
	}

}
