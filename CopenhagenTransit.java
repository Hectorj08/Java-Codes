import java.util.Scanner;
public class CopenhagenTransit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double fare = 0.0;
		
		System.out.println("Enter zone number :");
		int zoneNumber = input.nextInt();
		
		System.out.println("Enter adult or child :");
		String adultOrChild = input.next();
		
		
		System.out.print("The fare for " + adultOrChild + " to zone number " + zoneNumber + " is ");
		
		if ( (zoneNumber <= 2) && (adultOrChild.equals("adult")) ) {
			System.out.print(fare = 23.0);
		}
		else if ((zoneNumber<=2) && (adultOrChild.equals("child"))) {
			System.out.print(fare = 11.5);
		}
		else if((zoneNumber == 3) && (adultOrChild.equals("adult"))) {
			System.out.print(fare = 34.5);
		}
		else if(((zoneNumber == 3) || (zoneNumber == 4) && (adultOrChild.equals("child")))) {
			System.out.print(fare = 23.0);
		}
		else if((zoneNumber == 4) && (adultOrChild.equals("adult"))) {
			System.out.print(fare = 46.0);
		}
		else if(zoneNumber>4) {
			System.out.print(fare = -1.0);
		}
		System.out.println(".");
	}

}

