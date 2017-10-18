import java.util.Random;

public class Passenger {
	private int ID; // passengers ID
	private int startingStation; // passengers starting station
	private int destinationStation; // passengers destination station
	Random rand = new Random(); //this is just for random numbers
	private int startingStationSeed = rand.nextInt(100 - 0) + 1; //this is for giving the passenger a random starting station
	private int destinationStationSeed = rand.nextInt(100 - 0) + 1; //this is for giving the passenger a random destination station
	private int passengerCounter;
	
	Passenger() {
		ID = passengerCounter;
		startingStation = startingStationSeed;
		destinationStation = destinationStationSeed;
		checkStations();
	}

	private void checkStations() {
		if (startingStation == destinationStation) {
			destinationStation = destinationStationSeed;
		}
	}
	
	public void setID(int ID){
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

	public int getstartingStation() {
		return startingStation;
	}

	public int getdestinationStation() {
		return destinationStation;
	}

}
