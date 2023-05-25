package atnd;

public class Main {

	public static void main(String[] args) {
		Car ToyotaVios = new Car();
		System.out.println("TOYOTA VIOS");
		System.out.println("Speed: "+ToyotaVios.Carspeed);
		System.out.println("Color: "+ToyotaVios.Carcolor);
		System.out.println("Price: "+ToyotaVios.Carprice);
		
		ToyotaVios.drive();
		ToyotaVios.stop();
		System.out.println("*********************");
		
		Plane U2Spy = new Plane();
		System.out.println("U-2 SPY PLANE");
		System.out.println("Speed: "+U2Spy.Planespeed);
		System.out.println("Color: "+U2Spy.Planecolor);
		System.out.println("Price: "+U2Spy.Planeprice);
		
		U2Spy.fly();
		U2Spy.stop();
		System.out.println("*********************");
		
		Boat FandangoYacht = new Boat();
		System.out.println("FANDANGO YACHT");
		System.out.println("Speed: "+FandangoYacht.Boatspeed);
		System.out.println("Color: "+FandangoYacht.Boatcolor);
		System.out.println("Price: "+FandangoYacht.Boatprice);
		
		FandangoYacht.floats();
		FandangoYacht.stop();
	}

}
