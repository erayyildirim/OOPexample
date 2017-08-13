package tr.org.linux.kamp.vehicle;



public abstract class Vehicle {
	
	private String brand;
	private String model;
	private int speed;
	private int capacity;
	private int numberOfWheels;
	private boolean hasAerofoil;
	private boolean hasAutoPilot;
	private GasType gasType;
	
	
	
	public Vehicle(String brand, String model, int speed , int capacity, int numberOfWheels,boolean hasAerofail,
			boolean hasAutoPilot, GasType gasType){
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.capacity = capacity;
		this.numberOfWheels = numberOfWheels;
		this.hasAerofoil= hasAerofail;
		this.hasAutoPilot = hasAutoPilot;
		this.gasType = gasType;
		
	}
	

	
	
	public String gasTypeMessage(){
		switch(this.gasType){
		case BENZIN: 
			return "Araç benzinlidir.";
		case LPG :
			return "Araç gazlıdır.";
		default : 
			return "Hatalı gaz seçimi.";
		}

	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getSpeed() {
		System.out.println("Mevcut hız: "+speed);
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getNumberOfWheels() {
		return numberOfWheels;
	}


	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}


	public boolean isHasAerofail() {
		return hasAerofoil;
	}


	public void setHasAerofail(boolean hasAerofail) {
		this.hasAerofoil = hasAerofail;
	}


	public boolean isHasAutoPilot() {
		return hasAutoPilot;
	}


	public void setHasAutoPilot(boolean hasAutoPilot) {
		this.hasAutoPilot = hasAutoPilot;
	}


	public GasType getGasType() {
		return gasType;
	}


	public void setGasType(GasType gasType) {
		this.gasType = gasType;
	}
	public enum GasType {
		LPG , BENZIN

	}

	
}
	
	
	
