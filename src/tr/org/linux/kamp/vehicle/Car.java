package tr.org.linux.kamp.vehicle;



public class Car extends Vehicle implements Driveable{

	public Car(String brand, String model, int speed, int capacity,
			int numberOfWheels, boolean hasAerofail, boolean hasAutoPilot,GasType gasType) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofail, hasAutoPilot,gasType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeMotor() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void processGas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGear() {
		// TODO Auto-generated method stub
		
	}
	

}
