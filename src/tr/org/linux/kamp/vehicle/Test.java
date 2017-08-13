package tr.org.linux.kamp.vehicle;

import tr.org.linux.kamp.vehicle.Vehicle.GasType;

public class Test {
	
	public static void main(String[] args) {
		
		Plane pln = new Plane("Airbuss", "GNU", 700, 20, 2, false, false,GasType.BENZIN);
		System.out.println(pln.gasTypeMessage());
		
		pln.setAutoPilotActive(true);
		pln.setFlightCode("1251");
		pln.executeMotor();
		
		int x=pln.getCapacity();
		System.out.println("Uçak kapasitesi: " + x );
		
		pln.liftOfTypeMessage();
		
		int y = pln.setMaximumFeed(2000);
		System.out.println("Mevcut yükseklik " + y +"feed");
		
		pln.isAutoPilotActive();
		pln.getSpeed();
		
		Car car = new Car("abcd", "sdfsd", 100, 4, 0 , false,false, GasType.LPG);
		System.out.println(car.gasTypeMessage());
		
		
	}

}
