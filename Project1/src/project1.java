import java.util.Random;
import java.util.Scanner;
//hello
public class project1 {

	public static void main(String[] args) {
    
	//Initialize
	Random rand = new Random();
    	Scanner scan = new Scanner(System.in);
    	
     int score = 0; 
   	 int a = 1;
    
  	 while ( a < 2 ) {
  		 score--;
  		 System.out.println("Enter start/quit to start the game or leave");
   		
		 
   	 String control = scan.nextLine();
		 
   	 if (control.equals("quit")){
    		break;
  	  }else if (control.equals("start")) {
 	   
     	 	int d = rand.nextInt(50);
    		int h = rand.nextInt(50);
		 
         System.out.println("The current distance to the wall is:" + d +"m" );
         System.out.println("The current height of the wall is:" + h + "m");	
   
         System.out.println("Please enter an angle from 0 - 90 Degrees");
		 
         double angle = scan.nextDouble(); 
         double radians = Math.toRadians(angle);
          
         System.out.println("Please enter a speed");
         int v = scan.nextInt();
          
         double y = d *  Math.tan(radians) - (9.8 * d * d)/ (2 * (Math.pow(v * Math.cos(radians), 2)));
         System.out.println(y);
         System.out.println("Your current score is:" + score);
		 
	 //double difference;
	 double percent_difference;
		 
	 //difference = h-y;
	 percent_difference = Math.abs(h-y)/h;
		 
	 	if ((y>h)(percent_difference<=0.1){
		 System.out.println("You made it!");
		}
		else if ((y>h)&&(percent_difference<=0.2){
		 System.out.println("Plenty of room! ");
		}
		else if ((y<h)&&(percent_difference<=0.1){
		 System.out.println("Not quite over!");	
		}
		else if ((y<h)&&(percent_difference>=0.5){
		 System.out.println("Not even close!");
		}
          }
		 
	
   
    }
        
       
   
    
    

	}

}
