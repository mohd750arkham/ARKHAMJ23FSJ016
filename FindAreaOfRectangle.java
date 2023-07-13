package openlabbook1;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length of the rectangle :");
		double length = scanner.nextDouble();
		
		System.out.println("enter the width of the rectangle :");
		double width = scanner.nextDouble();
		
		double Area = length*width;
		
		System.out.println("Area of the rectangle is:" + Area);
	}

}
