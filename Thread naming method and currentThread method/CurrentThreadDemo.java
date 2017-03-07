class CurrentThreadDemo extends Thread{  
 public void run(){  
  System.out.println(currentThread().getName());  
 }   
 public static void main(String args[]){  
  CurrentThreadDemo t1=new CurrentThreadDemo();  
  CurrentThreadDemo t2=new CurrentThreadDemo();  
  t1.setName("First Thread");
  t2.setName("Second Thread");
  t1.start();  
  t2.start();  
 }  
} 
