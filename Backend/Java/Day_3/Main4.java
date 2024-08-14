package Day_3;

//Super Keyword
class A{
	int a=10;
	A(String name){
		System.out.println("Welcome "+name);
	}
	void method1() {
		System.out.println("I am a Super class product");
	}
}

class B extends A{
	B(){
		super("Jeeva");
	}
	void method2() {
		System.out.println("Super class variable : "+super.a);
		super.method1();
	}
}

public class Main4 {
	public static void main(String[] args) {
		B b=new B();
		b.method2();
	}
}