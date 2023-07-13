package openlabbook1;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle:");
		double radius = sc.nextDouble();
		
		double area = Math.PI * (radius*radius);
		System.out.println("the area of circle: " + area);
		double Circumference = Math.PI* 2 * radius;
		System.out.println("the circumference of circle is:" + Circumference);
	}

}
