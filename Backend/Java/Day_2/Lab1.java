package Day_2;

import java.util.*;
class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display(){
		System.out.println("Person name is  "+name+" Person age is "+age);
	}
}
public class Lab1 {

	public static void main(String[] args) {
		Scanner jee=new Scanner(System.in);
		System.out.println("Enter the names");
		String a1=jee.nextLine(),a2=jee.nextLine();
		System.out.println("Enter the ages");
		int b1=jee.nextInt(),b2=jee.nextInt();
		
		Person sc=new Person(a1,b1);
		sc.display();
		Person s=new Person(a2,b2);
		s.display();
	}
}