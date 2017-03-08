public class WrapperCompare{


	public static void main(String[] args) {
		//Attempting compareTo() method will individual wrappers.
		Value<String> obj = new Value<String>();
		obj.compare(new String("sahil"), new String("sahij"));
	}
}

class Value<T extends Comparable<T>>{
	public void compare(T val1, T val2){
		/*
		T val1 = new T("sahil");
		T val2 = new T("sahil");
		*/
		System.out.println("Result : " + val1.compareTo(val2));
	}
}