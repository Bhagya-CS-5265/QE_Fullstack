package Activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	public Car(String color, String transmission, int make) {
		super();
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres =4;
		this.doors = 4;
	}
	void displayCharacteristics() {
		System.out.println("color of the car is" + this.color);
		System.out.println("transmission of the car is" + this.transmission);
		System.out.println("car was made in" + this.make);
		System.out.println("cas has" + this.doors +"doors");
	}
	void accelarate() {
		System.out.println("car moves forward");
	}
	void brake() {
		System.out.println("car stops");
	}		 	 

}
