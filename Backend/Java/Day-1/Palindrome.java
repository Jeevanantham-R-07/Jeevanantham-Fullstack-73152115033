package Day_1;

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner jee = new Scanner(System.in);
	
		String s,rev;
		System.out.println("Enter the String : ");
		s=jee.nextLine();
		
		StringBuilder sc=new StringBuilder(s);
		rev=sc.reverse().toString();
		
		if(rev.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}