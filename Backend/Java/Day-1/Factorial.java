package Day_1;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int number,factorial=1;
		Scanner jee = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number=jee.nextInt();
		for(int i=number;i>1;i--) {
			factorial*=i;
		}
		System.out.println("The factorial is : "+factorial);
	}
}
