package Vehicles;

public class Vehicle {
	
	private String brand;
	private String color;
	private String model;
	private int seats;
	private String transmission; //manual or auto
	
	//Constructor
	
	public Vehicle(String brand, String color, String model, int seats, String transmission) {
		super();
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.seats = seats;
		this.transmission = transmission;
	}
	
	//Functions
	
	public void start() {
		System.out.println(color + " " + brand + " " + model + " is started");
		
	}
	
	public void stop() {
		System.out.println(color + " " + brand + " " + model + " is stop");
	}
	
	public void accelerate(int speed) {
		this.accelerate(0);
	}
	
	public void filltank(double liters) {
		this.filltank(2.5);
	}
	
	public void changeGear(int gear) {
		String manual = null;
		if(this.transmission == manual) {
			System.out.println("Gear is Changed");
		}
		else {
			System.out.println("It is an Automatic Transmisson");
		}
		this.changeGear(1);
	}

	
	//Getter & Setters
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", color=" + color + ", model=" + model + ", seats=" + seats
				+ ", transmission=" + transmission + "]";
	}


}
