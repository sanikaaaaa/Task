package Taks1;

interface VehicleCar{
	
	
	
	public static final  int  a = 10;
	
	void vehicleNumber(String vehicleNumber);
	void brand(String brand);
	void speed(float speed);

}
class car1 implements VehicleCar{

	int a=13;

	

	@Override
	public void vehicleNumber(String vehicleNumber) {
	//System.out.println("super is :"+super.);
		System.out.println( a);
		
		
		// TODO Auto-generated method stub
		System.out.println("Vehicle Number is:" +vehicleNumber );
		
	}

	@Override
	public void brand(String brand) {
		// TODO Auto-generated method stub
		System.out.println("Brand is :" + brand);
		
	}

	@Override
	public void speed(float speed) {
		// TODO Auto-generated method stub
		System.out.println("Speed is :" + speed);
		
	}
	
	
}
public class InterfaceTask {
	public static void main(String args[]) {
 VehicleCar obj3 = new car1();
 obj3.vehicleNumber("MH12 - 7654") ;
 obj3.brand( "tata");
 obj3.speed(10.f);
 
 
}
}
