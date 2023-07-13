package openlabbook1;

import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the Triangle:");
		double base = sc.nextDouble();
		
		System.out.println("Enter the height of the Triangle:");
		double height = sc.nextDouble();
		
		double area = (base*height)/2;
		System.out.println("Area of Triangle is:" + area);
	}

}
