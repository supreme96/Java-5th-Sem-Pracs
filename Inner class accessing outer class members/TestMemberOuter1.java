class Outer{
	int data =40;
	class Inner{
		void show(){
			System.out.println(data);
		}
	}

	public static void main(String[] args){
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.show();
	}

}