package atnd;

public class Plane extends Vehicle {
	String wingSpan = "88.4 meters";
	
	void fly() {
		System.out.println("U-2 Spy Plane is flying!");
	}
	@Override
	void stop() {
		super.stop();
	}
}
