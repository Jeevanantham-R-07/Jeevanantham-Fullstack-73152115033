package Day_3;

//Multilevel Inheritance 
class Vehicle{
	void noOfEngine() {
		System.out.println("One Engine");
	}
}

class TwoWheeler extends Vehicle{
	void noOfWheeles() {
		System.out.println("I have two wheeles");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("The Brand Name is Hounda");
	}
}


public class Main2 {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfWheeles();
		bike.brandName();
		bike.noOfEngine();
	}
}