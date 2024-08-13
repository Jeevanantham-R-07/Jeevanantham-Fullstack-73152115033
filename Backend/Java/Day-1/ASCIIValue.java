package Day_1;

import java.util.*;
public class ASCIIValue {

	public static void main(String[] args) {
		Scanner jee=new Scanner(System.in);
		System.out.println("Enter the character :");
		char a=jee.next().charAt(0);
		int n=a;
		System.out.println("The ASCII Value of "+a+" is "+n);
	}
}