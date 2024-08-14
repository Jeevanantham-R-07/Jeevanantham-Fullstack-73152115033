package Day_1;

public class Object {
    static class Car {
        String color;
        String model;

        Car(String color, String model) {
            this.color = color;
            this.model = model;
        }
        void displayInfo() {
            System.out.println("Car Model: " + model);
            System.out.println("Car Color: " + color);
        }
    }
    
	public static void main(String[] args) {
		 Car myCar = new Car("black", "Rayales");  
	     myCar.displayInfo();	
	}
}