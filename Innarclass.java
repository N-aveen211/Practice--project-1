package collection;
class OuterClass {
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}
public class Innarclass {

	public static void main(String[] args) {
		OuterClass Outer = new OuterClass();
	    OuterClass.InnerClass myi = Outer.new InnerClass();
	    System.out.println(myi.y + Outer.x);
	}

}
