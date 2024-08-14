package Day_3;


class Employee{
	void work() {
		System.out.println("Full stack developer");
	}
	void getSalary() {
		System.out.println("75000 per month");
	}
}

class HRManager extends Employee{
	void work() {
		System.out.println("HRManager");

	}
	void addEmployee() {
		System.out.println("Gopi join men stack developer");
	}
}

public class Lab4 {
	public static void main(String[] args) {
		HRManager jee=new HRManager();
		jee.work();
		jee.addEmployee();
		jee.getSalary();

	}
}