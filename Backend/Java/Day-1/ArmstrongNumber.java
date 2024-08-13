package Day_1;

import java.util.*;
public class ArmstrongNumber {
	public static void main(String []args) {
		
		Scanner jee=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int number =jee.nextInt();
		String s=String.valueOf(number);
		int n=s.length(),temp,result=0,num=number;
		
		for(int i=0;i<n;i++) {
			temp=number%10;
			result+=Math.pow(temp, n);
			number/=10;
		}
		
		if(num==result)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");		
	}
}