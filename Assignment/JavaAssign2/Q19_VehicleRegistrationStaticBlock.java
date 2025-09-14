/*
Problem 19: Vehicle Registration – Static Block
Scenario:
Add a static block to Vehicle class:
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads
● Verify that the message prints only once when multiple vehicles are created
*/

class Vehicle
{
	private String regNo;
	private String ownerName;
	private String vehicleType;
	static int vehicleCount=0;
	
	static
	{
		System.out.println("Welcome to CDAC Vehicle Registration Portal");
	}
	
	Vehicle(String ownerName, String vehicleType)
	{
		vehicleCount++;

		this.regNo= "MH-2025-"+vehicleCount;;
		this.ownerName=ownerName;
		this.vehicleType= vehicleType;
		
	}
	
	String getRegNo()
	{
		return regNo;
	}
	
	String getOwnerName()
	{
		return ownerName;
	}
	
	String getVehicleType()
	{
		return vehicleType;
	}
}



class Q19_VehicleRegistrationStaticBlock
{
	public static void main(String args[])
	{
		Vehicle v1= new Vehicle("Sumit", "Car");
		Vehicle v2= new Vehicle("Karan", "Bike");
		
		System.out.println("Registration No: "+v1.getRegNo()+", Owner: "+v1.getOwnerName()+", Vehicle Type: "+v1.getVehicleType());
		System.out.println("Registration No: "+v2.getRegNo()+", Owner: "+v2.getOwnerName()+", Vehicle Type: "+v2.getVehicleType());
		
	}
}
