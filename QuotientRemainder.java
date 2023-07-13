package openlabbook1;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the dividend: " );
		
		int dividend = scan.nextInt();
		
		System.out.println("enter the divisor: ");
		
		int divisor = scan.nextInt();
		
		int quotient = dividend / divisor;
		int remainder  = dividend % divisor; 
		
		System.out.println("Quotient :" +quotient);
		System.out.println("Remainder :" +remainder);
	}

}
