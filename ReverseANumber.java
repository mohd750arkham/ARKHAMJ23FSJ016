package openlabbook1;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int reversenum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the No and press Enter: ");
		 num = sc.nextInt();
		 
		 while(num != 0) {
			 reversenum = reversenum * 10;
			 reversenum = reversenum + num%10;
			 num = num/10; 
					 
		 }
		 System.out.println("Reverse of input number is : " + reversenum);
	}

}
