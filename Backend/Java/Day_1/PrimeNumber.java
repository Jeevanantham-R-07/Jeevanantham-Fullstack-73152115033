package Day_1;

import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner jee=new Scanner(System.in);
		int number,count=0;
		System.out.println("Enter the Number : ");
		number=jee.nextInt();
		for(int i=2;i<number-1;i++) {
			if(number%i==0)
				count++;	
		}
		if(count==0)
			System.out.println("prime");
		else
			System.out.println("not prime");

	}
}