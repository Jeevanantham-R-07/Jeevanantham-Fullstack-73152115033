package Day_1;

import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner jee=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=jee.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i+j)>=n-1)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
