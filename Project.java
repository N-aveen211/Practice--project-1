package collection;
 class privateclass{
	private String name;
	String name1;
	privateclass(String a ){
		name =a;
		
		 
	}
	String setNmae(String b) {
		return name1=b;
		
	}
	 void getName() {
		System.out.println( name +" "+ name1);
	}
	 
}
 

public class Project {

	public static void main(String[] args) {
		String a="Hello";
		privateclass pc = new privateclass(a);
		pc.setNmae("World");
		pc.getName();
		

	  
	}

}
