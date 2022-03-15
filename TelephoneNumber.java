import java.util.Scanner;
public class TelephoneNumber {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String letter;
		String Num = "";
		
		System.out.println("Please enter a telephone number using letters : ");
		letter = scnr.nextLine().toUpperCase();
		
		for(int a=0;a<letter.length() && Num.length()<8;a++) {
		 if (letter.charAt(a)>='A' && letter.charAt(a)<='C')
			 Num+="2";
		 else if(letter.charAt(a)>='D' && letter.charAt(a)<='F')
			 Num+="3";
		 else if(letter.charAt(a)>='G' && letter.charAt(a)<='I')
			 Num+="4";
		 else if(letter.charAt(a)>='J' && letter.charAt(a)<='L')
			 Num+="5";
		 else if(letter.charAt(a)>='M' && letter.charAt(a)<='O')
			 Num+="6";
		 else if(letter.charAt(a)>='P' && letter.charAt(a)<='S')
			 Num+="7";
		 else if(letter.charAt(a)>='T' && letter.charAt(a)<='V')
			 Num+="8";
		 else if(letter.charAt(a)>='W' && letter.charAt(a)<='Z')
			 Num+="9";
		 if(Num.length() == 3)
			 Num+="-";
		}
		System.out.println(Num);

	}

}
