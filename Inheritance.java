package Taks1;

class Vehicle{
	int vehicleNumber;
	String brand;
	float speed;
	
	
	public Vehicle(int vehicleNumber, String brand, float speed) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.speed = speed;
	}
	
	
	
		
	
	
}

class Car extends Vehicle{
	public Car(int vehicleNumber, String brand, float speed) {
		super(vehicleNumber, brand, speed);

		
	}

	void showDetails() {
		System.out.println(" Car has AC,Bike is overweight");
		
		System.out.println("VehicleNumber is :" + vehicleNumber  + "Brand is :"+ brand+  "Speed is:" + speed  );

	}
	
	
}

class Bike extends Vehicle{
	public Bike(int vehicleNumber, String brand, float speed) {
		super(vehicleNumber, brand, speed);
		
		// TODO Auto-generated constructor stub
	}

	void showDetails() {
		System.out.println("I bought a new car , I have to buy a cover for Bike");
		System.out.println("VehicleNumber is:" + vehicleNumber  + "Brand is :"+ brand+  "Speed is:" + speed  );

		
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		
		Car obj = new Car(9911, "Tata", 12.80F);
		
		obj.showDetails();
		
		Bike obj2 = new Bike(5432,"HeroHonda",76.9f);
		obj2.showDetails();
		

		
		
	}

}
