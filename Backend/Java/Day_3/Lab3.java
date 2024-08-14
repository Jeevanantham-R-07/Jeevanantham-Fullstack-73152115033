package Day_3;


class Shape{
	void getArea(float width ,float height) {
		System.out.println("hi");
	}
}

class Rectangle extends Shape{
	public void getArea(float width ,float height) {
		float area=width*height;
		System.out.println("Area of the Rectangle is : "+area);
	}
}

public class Lab3 {
	public static void main(String[] args) {
		Shape jee= new Rectangle();
		jee.getArea(10.0f,20.5f);
	}
}