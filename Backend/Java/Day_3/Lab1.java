package Day_3;

class  Animal{
	void makeSound() {
		System.out.println("Animal sound");
	}
}
class  Cat extends Animal {
	void  makeSound() {
		System.out.println("meow !");
	}
}
public class Lab1 {
	public static void main(String[] args) {
		Animal cat=new Cat();
		cat.makeSound();
	}
}