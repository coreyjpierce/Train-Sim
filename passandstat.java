import java.util.Random;
public class passandstat {

	static int passengerID;
	static int startingStationID;
	static int destinationStationID;

	public static void main(String[] args) {
		Random rand = new Random();
		int passengers; 
		passengers = rand.nextInt(100 - 0) + 1;
		int passengerCounter = 1;
		for(int i = passengers;  i > 0; i--) {
			Passenger passenger = new Passenger();
			passenger.setID(passengerCounter);
			System.out.println("Passenger ID: " + passenger.getID());
			System.out.println("Passenger Starting Station: " + passenger.getstartingStation());
			System.out.println("Passenger Destination Station: " + passenger.getdestinationStation());
			System.out.println();
			passengerCounter++;
		}
			
	}
}
