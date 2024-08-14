package Day_3;

//Single Inheritance 

class TwoWheelers{
	void noOfWheele() {
		System.out.println("I have two wheeles");
	}
}


class Bikes extends TwoWheelers{
	void brandName() {
		System.out.println("The Brand Name is Hounda");
	}
}


public class Main1 {
	public static void main(String[] args) {
		Bikes bike=new Bikes();
		bike.noOfWheele();
		bike.brandName();

	}
}