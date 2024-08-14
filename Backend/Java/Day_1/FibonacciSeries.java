package Day_1;

import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner jee=new Scanner(System.in);
		int number,a=0,b=1,sum;
		System.out.println("Enter the Number : ");
		number=jee.nextInt();
		for(int i=0;i<number;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}

	}

}
