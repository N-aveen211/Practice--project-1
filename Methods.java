package collection;
class methodex{
	int a=5,b=10;
	int add() {
		return a+b;
	}
	int add(int c,int d) {
		return c+d+b;
	}
	int add(int c,int b,int a) {
		return c+b+a;
	}
}
class methodex1 extends methodex{
	int add(int c,int b,int a) {
		return c+b+a;
	}
}
public class Methods {

	public static void main(String[] args) {
	methodex1 m1 = new methodex1();
	System.out.println (m1.add());
	System.out.println(m1.add(10, 20));
	System.out.println(m1.add(10, 20, 30));
	}

}
