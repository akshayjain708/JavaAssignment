package Vehicles;

public class Car extends Vehicle {
	

	private String opendoor;
	private String windows;

	
	// Constructor

	public Car(String brand, String color, String model, int seats, String transmission, String opendoor,
			String windows) {
		super(brand, color, model, seats, transmission);
		this.opendoor = opendoor;
		this.windows = windows;
	}

	//Functions
	
	@Override
	public void start() {
		System.out.println("The Car has been started");
		super.start();
	}

	@Override
	public void stop() {
		System.out.println("The Car have been stopped");
		super.stop();
	}

	

	public void openDoor(String open) 
	{
		if(opendoor == open) {
			System.out.println("The Doors are open");
		}
		else {
			System.out.println("Doors are closed");
		}
		
	}
	
	public void closeWindowSheilds(String open) 
	{
		if(windows == open) 
		{
			System.out.println("Please close the Window Shields");
		}
		else
		{
			System.out.println("Window Shields are closed");
		}
	}

	
	//Getter & Setter
	
	public String getOpendoor() {
		return opendoor;
	}


	public void setOpendoor(String opendoor) {
		this.opendoor = opendoor;
	}


	public String getWindows() {
		return windows;
	}


	public void setWindows(String windows) {
		this.windows = windows;
	}

}


