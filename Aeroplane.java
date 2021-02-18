package Vehicles;

public class Aeroplane extends Vehicle 
{

	public Aeroplane(String brand, String color, String model, String seats) 
	{
		super(brand, color, model, seats, null);
	}


	@Override
	public void start() 
	{
		System.out.println("Plane has Started");
		super.start();
	}

	@Override
	public void stop() 
	{
		System.out.println("Plane have landed");
		super.stop();
	}
}
