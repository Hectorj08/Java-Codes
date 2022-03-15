
public class Farm extends Animal {

	private String farmName;
	private int numAnimals;
	private Animal [] animals;


	public Farm (){
		animals = new Animal[10];
		this.farmName = "";
		this.numAnimals = 0;
	}
	public Farm(java.lang.String farmName) {
		this.farmName = farmName;
		animals = new Animal[10];
		this.numAnimals = 0;
	}
	public Farm(int numAnimals) {
		this.farmName = "";
		this.numAnimals = 0;
		animals = new Animal[numAnimals];
		if(numAnimals < 0) {
			this.numAnimals = 0;
		}
	}
	public Farm(java.lang.String farmName, int numAnimals) {
		this.numAnimals = 0;
		this.farmName = farmName;
		animals = new Animal[numAnimals];
		if(numAnimals < 0) {
			this.numAnimals = 0;
		}
	}
	public void setFarmName(java.lang.String farmName) {
		this.farmName = farmName;
	}
	public java.lang.String getFarmName() {
		return farmName;
	}
	public void addAnimal(Animal a) {
		if (this.numAnimals >= animals.length) resizeAnimalArray();
		animals[numAnimals++] = a;
	}
	public Animal getAnimal(int index) {
		if(index < 0 || index >= numAnimals) return null;
		return animals [index];
	}
	public int getNumAnimals() {
		return numAnimals;
	}
	public Animal getFirstAnimal() {
		if(animals.length == 0) return null;
		return animals [0];
	}
	public Animal getLastAnimal() {
		return animals [numAnimals - 1];
	}
	public Animal [] getAnimals() {
		return this.animals;
	}
	public Animal removeAnimal(int index) {
		if(index < 0 || index >= numAnimals) return null;
		 Animal[] temp = new Animal[animals.length];
	      int j = 0;
	      Animal a = animals[index];
	      for(int i = 0; i < numAnimals; i++) {
	         if(i != index) {
	            temp[j] = animals[i];
	            j++;
	         }
	      }
	      temp[animals.length-1] = null;
	      animals = temp;
	      numAnimals -= 1;
	      return a;
	   }
	public void removeAllAnimals() {
		this.numAnimals = 0;
	}
	public double getTotalWeightOfAllAnimals() {
		double sum = 0;
		for(int i = 0; i < numAnimals;i++)
			sum+=animals[i].getWeight();
		return sum;
	}
	public double getAverageWeightOfAllAnimals() {
		return getTotalWeightOfAllAnimals()/(numAnimals);
	}
	public int getNumberOfAnimalsAboveWeight(double weight) {
		int i = 0;
		for (int j = 0; j < numAnimals; j++) 
			if (animals[j].getWeight() > weight)
				i++;
		return i;
	}
	public int getNumberOfAnimalsBelowWeight(double weight) {
		int i = 0;
		for (int j = 0; j < numAnimals; j++) {
			if (animals[j].getWeight() < weight)
				i++;
		}
		return i;
	}
	public void increaseWeightOfAllAnimals() {
		for(int i = 0;i<numAnimals;i++) 
			animals[i].gainWeight();	
	}
	public void increaseWeightOfAllAnimals(double weight) {
		for (int i = 0; i < numAnimals; i++) {
			animals[i].gainWeight();
		}
	}
	public void resizeAnimalArray() {
		Animal[] copy = new Animal[animals.length * 2];
		for (int i = 0; i < animals.length; i++) {
			copy[i] = animals[i];
		}
		animals = copy;
	}
	public void printAllDetails () {
		System.out.printf("FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n"+ this.farmName,this.numAnimals,animals.length);
		System.out.printf( "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n",
		            this.getName() , this.getBirthYear() , this.getWeight(), this.getGender());
	}

}











