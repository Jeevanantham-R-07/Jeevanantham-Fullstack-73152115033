package Day_2;

class Rectangle{
	float width ,height;
	
	Rectangle(float width ,float height){
		this.width=width;
		this.height=height;
		this.area(width,height);
	}
	
	public void area(float width ,float height) {
		float area=width*height;
		System.out.println("Area of the Rectangle is : "+area);
		this.perimeter(width,height);
	}
	
	public void perimeter(float width ,float height) {
		float perimeter=(2*width)+(2*height);
		System.out.println("Perimeter of the Rectangle is : "+perimeter);
	}	
}

public class Lab3 {

	public static void main(String[] args) {
		Rectangle sc=new Rectangle(2,4);
		Rectangle jee=new Rectangle(2.4f,4.78f);
	}
}