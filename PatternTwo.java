import java.util.Scanner;
  public class PatternTwo{ 
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("Please enter a number 1...9 : ");
    int n = scnr.nextInt();
    int i,j;
  
    for (i=1; i <= n; i++) {
		for(j=2*(n-i); j >=1; j--) {
			System.out.print(" ");
		}
		for (j=i;j>=1;j--) {
			System.out.print(" "+j);
		}
		System.out.println();
    }
  
   }
  }

