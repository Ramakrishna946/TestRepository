package day23042025;

public class Honda extends Bike {
	

		int speedlimit=150;  
		 public static void main(String args[]){  
		  Bike obj=new Honda();  
		  obj.run();
		  System.out.println(obj.speedlimit);//90 
		  System.out.println(obj.gear);
		  System.out.println(obj.time);
		  
		   } 
		 public void run() {
			 System.out.println("Honda bike runs superfast");
		 }

}
