package Vehicles;

public class CargoPlane extends Aeroplane {
	
	private int weightCapacity;
	
	public CargoPlane(String brand, String color, String model, int weightCapacity) {
		super(brand, color, model,null);
		
		this.weightCapacity = weightCapacity;
	}

}
