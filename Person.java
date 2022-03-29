
public abstract class Person extends Passenger {
	
private int numOffspring;

public Person() {
	super();
	this.numOffspring = 0;
}
public Person(int numOffspring) {
	super();
	this.numOffspring = numOffspring;
}
public Person (String name,int birthYear,double weight, double height, char gender,int numCarryOn, int numOffspring ) {
	super(name,birthYear,weight,height,gender,numCarryOn);
	this.setNumOffspring(numOffspring);
}
public void setNumOffspring(int numOffspring) {
	if(numOffspring < 0) {
		this.numOffspring = 0;
      }
    else {
	this.numOffspring = numOffspring;
      }
}
public int getNumOffspring() {
	return numOffspring;
}
public void printDetails() {
	super.printDetails();
	System.out.printf("Person: Number of Offspring: %4d\n",this.numOffspring);
}
public String toString() {
	String n = String.format(super.toString()+" Person: Number of Offspring: %4d\n",this.numOffspring);
	return n;
}
public boolean equals(Object o) {
	if(o==null) {return false;}
	if(this==o) {return true;}
	if(o instanceof Person) {
		Person othern = (Person)o;
		if(super.equals(othern)) {
		if(numOffspring == othern.numOffspring) {
			return true;
		}
	  }
	}
	return false;
}


}
