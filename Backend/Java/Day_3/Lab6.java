package Day_3;

class Anima {
	void move() {
		System.out.println("this is Animal");
	}
}

class Cheetah extends Anima {
	void move() {
		System.out.println("This is Cheeta");
	}
}

public class Lab6 {
	public static void main(String[] args) {
		Anima jee=new Cheetah();
		jee.move();
	}
}