package openlabbook1;

import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Side of Square :");
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		
		double Area = side * side;
		System.out.println("Area of the square is :" + Area);
	}

}
