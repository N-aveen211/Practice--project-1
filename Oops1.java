package multithreading;
abstract class Animal{
	void eat() {
		System.out.println("Eat");
}
	abstract void sound();

}
 class Dog extends Animal{
	public void sound() {
		System.out.println("Bark");
	}
	}

public class Oops1 {

	public static void main(String[] args) {
		Dog d=new Dog();
        d.sound();
        d.eat();
	}

}
