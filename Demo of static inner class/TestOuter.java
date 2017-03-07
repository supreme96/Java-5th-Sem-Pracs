class TestOuter{
	static int data = 30;
	static class Inner{
		static void show(){
			System.out.println(data);
		}
	}

	public static void main(String[] args){
		TestOuter.Inner.show();
	}
}