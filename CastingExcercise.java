package openlabbook1;

public class CastingExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		
		int i = b;
		
//		byte c = i;   
		
		byte d = (byte)i;
		
		byte x = 10;
		byte y = 20;
		
//		byte sum = x*y;  Error thrown because when two bytes are used in a 
//		arithmetic oper , the result will be integer
		
		int sum = x + y;
		System.out.println(sum);
	}

}
