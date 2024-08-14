package Day_3;


class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employeee extends Person {
    private String employeeId;
    private String jobTitle;

    public Employeee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return super.getLastName()  +" "+ jobTitle ;
    }
}
public class Lab7 {

	public static void main(String[] args) {
		 Employeee emp = new Employeee("Jeeva", "Nantham", "E33", "Software Engineer");
	        
	        System.out.println("First Name: " + emp.getFirstName());
	        System.out.println("Last Name: " + emp.getLastName());
	        System.out.println("Employee ID: " + emp.getEmployeeId());

	}

}
