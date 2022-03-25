
public class FlightTest {

	public static void main(String[] args) {
		
		//Flight flObj = new Flight(101, "Lufthansa", "Mumbai", "Germany");
		//System.out.println("fl obj "+flObj);
		
	}

}
abstract class A
{
	//may not have abstract methods
}

abstract class B { //must be declared as abstract class
	abstract void fun(); //method without code body
}

/*
 * 
 * 				Vehicle
 * 					|
 * 		--------------------------------------------------------------
 * 				|						|				|
 * 				FlyingVehicle			LandVehicle		SeaVehicle
 * 						|					|				|
 * 				---------------------
 * 				|		|
 * 			Baloon		Flight				Train			Boat
 * 						|
 * 			------------------------------------
 * 			|			|				|
 * 	CommercialFlight	FighterFlight	CargoFlight
 * 
 * 
 */


