package openlabbook1;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for i...:");

		int i = scan.nextInt();
		
		System.out.println("Enter value for j...:");
		
		int j = scan.nextInt();
		
		int mul = i*j;
		
		System.out.println(" the multiplication of i and j is :" +mul);
		
	}

}
