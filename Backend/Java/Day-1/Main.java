import java.util.*;
public class Main {
  public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	// int studentId;
	// String studentName;
	// float studentFees;

	// System.out.println("Enter Student Id");
	// studentId=sc.nextInt();
	// System.out.println("Enter Student Name");
	// studentName=sc.next();
	// System.out.println("Enter Student Fees");
	// studentFees=sc.nextFloat();

	// System.out.println("Student id :" + studentId);
	// System.out.println("Student Name :" + studentName);
	// System.out.println("Student Fees :" + studentFees);
	int arr[]=new int[5];
	int count=0;

	System.out.println ("Enter the array elements");
	for(int i=0;i<5;i++){
		arr[i]=sc.nextInt();
		count+=arr[i];
	}

	System.out.println("the sum of array is  :" + count);
  }
}