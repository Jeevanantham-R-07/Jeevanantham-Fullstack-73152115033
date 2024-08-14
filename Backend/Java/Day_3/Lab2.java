package Day_3;


class Vehicl{
	void drive(){
		System.out.println("This is Vehicle class");
	}
}

class Car extends Vehicl{
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Lab2 {
	public static void main(String[] args) {
		Vehicl sc=new Car();
		sc.drive();
	}
}