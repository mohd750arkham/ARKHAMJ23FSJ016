package openlabbook1;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'H';
		int ascii = ch;
//		You can cast char to int
		int castAscii = (int) ch;
		System.out.println("The ASCII value of " + ch + " is: " +ascii);
		System.out.println("The ASCII value of " + ch + " is: " +castAscii);
	}

}
