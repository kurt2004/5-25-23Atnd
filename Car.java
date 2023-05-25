package atnd;

public class Car extends Vehicle {
	String Name = "Toyota VIOS";
	String TireType = "All-season tires";
	
	void drive() {
		System.out.println("Toyota VIOS is driving!");
	}
	@Override
	void stop() {
		super.stop();
	}
}
