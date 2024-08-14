package Day_2;

class Circle{
	double radius;
	
	Circle (double radius){
		this.radius=radius;
	}
	
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    
}
public class Lab4 {
	public static void main(String[] args) {
		Circle sc=new Circle(2.3f);
		System.out.println("Start");
		System.out.println("Area: " + sc.getArea());
		System.out.println("Circumference: " +sc.getCircumference());
		 
		sc.setRadius(2.5f);
		System.out.println("Updated");
	    System.out.println("Area: " + sc.getArea());
	    System.out.println("Circumference: " +sc.getCircumference());
	}
}