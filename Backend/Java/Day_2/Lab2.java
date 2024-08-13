package Day_2;

import java.util.*;

class Dog{
	String name,breed;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}

	public void setName(String name) {
		this.name=name;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("Dog name :"+name);
		System.out.println("Dog type :"+breed);
	}
}


public class Lab2 {
	public static void main(String[] args) {
		Dog jee=new Dog("jimmy","lady");
		System.out.println("Inserteded");
		jee.display();
		jee.setName("tommy");
		jee.setBreed("boy");
		System.out.println("Updateded");
		jee.display();
	}
}
