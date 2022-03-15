
public class Airplane extends Passenger {
	
	private String airplaneName;
	private Passenger [] passengers;
	private int numPassengers;

	public Airplane() {
		passengers = new Passenger[100];
		this.airplaneName = "";
		this.numPassengers = 0;
	}
	public Airplane(java.lang.String airplaneName) {
		this.airplaneName = airplaneName;
		passengers = new Passenger[100];
		this.numPassengers = 0;
	}
	public Airplane(int numPassengers) {
		this.airplaneName = "";
		passengers = new Passenger[numPassengers];
		this.numPassengers = 0;
		if(numPassengers<0) {this.numPassengers = 0;}
	}
	public Airplane(java.lang.String airplaneName, int numPassengers) {
		this.airplaneName = airplaneName;
		passengers = new Passenger[numPassengers];
		this.numPassengers = 0;
		if(numPassengers<0) {
		this.numPassengers = 0;
		}
	}
	public void setAirplaneName(java.lang.String airplaneName) {
		this.airplaneName = airplaneName;
	}
	public java.lang.String getAirplaneName() {
		return airplaneName;
	}
	public void addPassenger(Passenger a) {
		if(this.numPassengers >= passengers.length) resizePassengerArray();
		passengers[numPassengers++] = a;
	}
	public Passenger getPassenger(int index) {
		if(index < 0 || index >= passengers.length) return null;
		return passengers[index];
	}
	public int getNumPassengers() {
		return numPassengers;
	}
	public Passenger getFirstPassenger() {
		if(passengers.length == 0) return null;
		return passengers[0];
	}
	public Passenger getLastPassenger() {
		return passengers[numPassengers -1];
	}
	public Passenger [] getPassengers() {
		return this.passengers;
	}
	public Passenger removePassenger(int index) {
		if(index < 0 || index >= numPassengers) return null;
		Passenger[] temp = new Passenger[passengers.length];
		int j=0;
		Passenger a = passengers[index];
		for(int i = 0; i < numPassengers;i++) {
			if(i != index) {
				temp[j] = passengers[i];
				j++;
			}
		}
		temp[passengers.length-1] = null;
		passengers = temp;
		numPassengers -= 1;
		return a;
	}
	public void removeAllPassengers() {
		this.numPassengers = 0;
	}
	public double getTotalWeightOfAllPassengers() {
		double sum = 0;
		for(int i = 0; i < numPassengers; i++) {
			sum += passengers[i].getWeight();
		}
		return sum;
	}
	public double getAverageWeightOfAllPassengers() {
		return getTotalWeightOfAllPassengers()/(numPassengers);
	}
	public int getNumberOfPassengersAboveWeight(double weight) {
		int i =0;
		for(int j = 0; j < numPassengers; j++) {
		if(passengers[j].getWeight() > weight)
			i++;
		}
		return i;
	}
	public int getNumberOfPassengersBelowWeight(double weight) {
		int i =0;
		for(int j = 0; j < numPassengers; j++) {
		if(passengers[j].getWeight() < weight)
			i++;
		}
		return i;
	}
	public void increaseWeightOfAllPassengers() {
		for(int i = 0; i < numPassengers; i++) 
			passengers[i].gainWeight();
	}
	public void increaseWeightOfAllPassengers(double weight) {
		for(int i = 0; i < numPassengers; i++) 
			passengers[i].gainWeight(weight);
	}
	public void resizePassengerArray() {
		Passenger [] copy = new Passenger[passengers.length * 2];
		for(int i = 0; i < passengers.length; i++ ) {
			copy[i] = passengers[i];
		}
		passengers = copy;
	}
	public void printAllDetails() {
		System.out.printf( "AirplaneName: %20s | Number of Passengers: %4d | Airplane Size: %4d\n" ,this.airplaneName, this.numPassengers, passengers.length);
		System.out.printf( "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n",this.getName() , this.getBirthYear() , this.getWeight(), this.getGender());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
