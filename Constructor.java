package collection;
class constor{
	int a,b,d;
	constor(int c){
		a=c;
		for(b=0;b<a;b++) {
			 d=++b;
			 System.out.println(d);
			}
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		constor n = new constor(5);		
	}

}
