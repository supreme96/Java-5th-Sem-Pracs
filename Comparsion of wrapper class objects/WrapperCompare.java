public class WrapperCompare{


	public static void main(String[] args) {
		//Attempting compareTo() method will individual wrappers.
		//Tested for Double, String and Float wrapper classes also.
		Integer val1 = new Integer(14);
		Integer val2 = new Integer(20);
		System.out.println("Result of Integer Compare: " + val1.compareTo(val2));
		String val3 = new String("AB");
		String val4 = new String("ab");
		System.out.println("Result of String Compare: " + val3.compareTo(val4));
	}

}