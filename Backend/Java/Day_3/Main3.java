package Day_3;

//heirarical Inheritances
class Vehicles{
	void noOfEngine() {
		System.out.println("One Engine");
	}
}
class TwoWheelr extends Vehicles{
	void noOfWheeles() {
		System.out.println("I have two wheeles");
	}
}

class Bik extends TwoWheelr{
	void brandName() {
		System.out.println("The Brand Name is Hounda");
	}
}
class Scooty extends TwoWheelr{
	void brandName() {
		System.out.println("The Brand Name is Activa");
	}
}
public class Main3 {
	public static void main(String[] args) {
	Bik jee=new Bik();
	jee.brandName();
	jee.noOfWheeles();
	jee.noOfEngine();
	
	Scooty sc=new Scooty();
	sc.brandName();
	sc.noOfWheeles();
	sc.noOfEngine();

	}

}
