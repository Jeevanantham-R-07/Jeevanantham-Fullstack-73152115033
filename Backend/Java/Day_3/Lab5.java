package Day_3;


class BankAccount{
	int accBal=0;
	void deposit(int n){
		System.out.println(n+" Amount is deposit successfully");
		this.accBal+=n;
	}
	void withdraw(int n) {
		System.out.println(n+"Ammount is withdraw successfully");
	}
}

class SavingsAccount extends BankAccount{
	void withdraw(int am){
		if(accBal<=1000||am>=accBal) {
			System.out.println("Balance is low");
		}
		else {
			System.out.println(am+" Ammount is withdraw successfully");
			this.accBal-=am;
		}
	}
}

public class Lab5 {
	public static void main(String[] args) {
		BankAccount jee=new SavingsAccount();
		System.out.println("Your account Balence is : "+jee.accBal);
		jee.deposit(12345);
		System.out.println("Your account Balence is : "+jee.accBal);
		jee.withdraw(2345);
		System.out.println("Your account Balence is : "+jee.accBal);
	}
}