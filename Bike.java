package Vehicles;

public class Bike extends Vehicle {
	

	public Bike(String brand, String color, String model, int seat, String transmission) {
		super(brand, color, model,2, transmission);
	}
	
	public void putStand(String stand, String yes, String no)
	{
		if(stand == yes)
		{
			System.out.println("The bike is on the Stand");
		}
		else
		{
			System.out.println("Please put on the stand");
		}
	}
	
	@Override
	
	public void start() 
	{
		System.out.println("Bike has been Started");
	}
	
	public void stop() 
	{
		System.out.println("Bike has been Stopped");
	}
	

}
