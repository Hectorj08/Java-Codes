
public class Animal extends java.lang.Object {
	private String name;
	private int birthYear;
	private double weight;
	private char gender;


	public Animal() {
		this.name = "";
		this.birthYear = 1900;
		this.weight = 0.0;
		this.gender = 'u';

	}
	public Animal(java.lang.String name, int birthYear, double weight, char gender) {
                this.name = name;
		this.weight = weight;
		this.birthYear = birthYear;
		this.gender = gender;

		if(weight < 0.0) {
			this.weight = -1.0;
		}
		if((gender == 'f') || (gender == 'm')) {
			this.gender = gender;
		}
		else {
			this.gender = 'u';
		}

	}
	public void setName(java.lang.String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getBirthYear() {
		return this.birthYear;
	}
	public void setWeight (double weight) {
		if (weight < 0.0) {
			this.weight = -1.0;
		}
		else {
			this.weight = weight;
		}
	}
	public double getWeight() {
		return this.weight;
	}
	public void setGender(char gender) {
		if((gender == 'f') || (gender == 'm')) {
			this.gender = gender;
		}
		else {
			this.gender = 'u';
		}
	}
	public char getGender() {
		return this.gender;
	}
	public int calculateAge(int currentYear) {
		int age = 0;
		age = currentYear - birthYear;
		if (currentYear < birthYear) return -1;
		return age;
	}
	public boolean isMale() {
		if (gender == 'm') {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFemale() {
		if(gender == 'f') {
			return true;
		}
		else {
			return false;
		}
	}
	public void printDetails() {
		System.out.printf("Name: %20s "+this.name);
		System.out.printf("| Year of Birth: %4d "+this.birthYear);
		System.out.printf("| Weight: %10.2f "+ this.weight);
		System.out.printf("| Gender: %c\n "+this.gender);
	}
	public void gainWeight() {
		weight = weight + 1.0;
	}
	public void gainWeight(double weight) {
		if (weight > 0.0) {
			this.weight = this.weight + weight;
		}
	}
	public void loseWeight() {
		if(this.weight >= 1.0) {
			this.weight = this.weight - 1.0;
		}
	}
	public void loseWeight(double weight) {
		if(this.weight - weight >= 0.0) {
			this.weight = this.weight - weight;
		}
	}


}
