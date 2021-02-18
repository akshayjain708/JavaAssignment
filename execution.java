package Vehicles;

public class execution 
{

	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle("suzuki","red","maruti",4, null);
		Car c1 = new Car("suzuki","red","maruti",4, null, null, null);
		
		v1.start();
		c1.start();				
	}
}


//Error: Could not find or load main class Vehicles.execution
//Caused by: java.lang.ClassNotFoundException: Vehicles.execution

//Error is appearing all the time thats why didn't wrote the whole execution


//Please mark my mistakes and let me what I have done wrong in the source code.
//Please write the mistakes and how can it be resolved also...

// Thank you
