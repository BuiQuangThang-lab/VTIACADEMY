
public class Boxing_UnBoxing {
	
	//----------------------Question1------------------------------//
	
	public static void Integer() {
		Integer a = 50000;
		Float Fa = new Float(a);
		System.out.printf("%.2f",Fa);
	}
	
	
	//-------------------------Question2-------------------------------//
	
	public static void convert_1() {
		String a = "1234567";
		int result = Integer.parseInt(a);
		System.out.println("\n" + result);
	}
	
	//-------------------------Question3----------------------------------//
	
	public static void convert_2() {
		Integer a = new Integer(123456);
		int result = a.intValue();
		System.out.println(result);
	}
	
	
   public static void main(String[] args) {
	   Integer();
	   convert_1();
	   convert_2();
}
}
