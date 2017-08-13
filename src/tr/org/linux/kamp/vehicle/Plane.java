package tr.org.linux.kamp.vehicle;



public class Plane extends Vehicle implements Driveable{


	public Plane(String brand, String model, int speed, int capacity,
			int numberOfWheels, boolean hasAerofail, boolean hasAutoPilot,
			GasType gasType) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofail, hasAutoPilot,
				gasType);
		// TODO Auto-generated constructor stub
	}

	private int maximumFeed;
	private String flightCode;
	private boolean isAutoPilotActive;
	
	//liftoftype enum ile yap.
	
	public String liftOfType(){
		
		return "Dikine kalkış yaparak uçak havalandı";
	}
	
	public void liftOfTypeMessage(){
		
		System.out.println(liftOfType());
	}

	@Override
	public void executeMotor() {
		System.out.println(getFlightCode() +" numaralı uçak motorları çalıştırıldı");
		
	}

	@Override
	public void processGas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGear() {
		// TODO Auto-generated method stub
		
	}

	public int getMaximumFeed() {
		return maximumFeed;
	}

	public int setMaximumFeed(int maximumFeed) {
		this.maximumFeed = maximumFeed;
		return maximumFeed;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public boolean isAutoPilotActive() {
		if(isAutoPilotActive){
			System.out.println("Otomatik pilot devreye girdi.");
		}
		return isAutoPilotActive;
	}

	public void setAutoPilotActive(boolean isAutoPilotActive) {
		this.isAutoPilotActive = isAutoPilotActive;
	}
	
	

}
