class ThDemo{
	public static void main(String[] args){
		Thread th = new Thread(){
			public void run(){
				for(int i=1; i<=20; i++){
					if((i%2)==1){
						System.out.println(i);
					}
				}
			}
		};
	th.start();
	Thread th2 = new Thread(){
		public void run(){
			for(int i=1; i<=20; i++){
				if((i%2)==0){
					System.out.println(i);
				}
			}
		}
	};
	th2.start();
	}
}