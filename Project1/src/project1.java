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
<<<<<<< HEAD
  		
  		 System.out.println("Enter start to begin/Enter quit to leave");
=======
  		 score--;
  		 System.out.println("Enter start/quit to start the game or leave");
   		
>>>>>>> 8fa4cfba387257c18db04ac5074b8ecf2a7b5f86
		 
   	 String control = scan.nextLine();
		 
   	 if (control.equals("quit")){
    		break;
  	  }else if (control.equals("start")) {
<<<<<<< HEAD
 	     
  		  //If the game start, you lose 1 point
  		 score--;
  		 System.out.println("Your score is:" + score);
     	 	
  		    int d = rand.nextInt(50);
=======
 	   
     	 	int d = rand.nextInt(50);
>>>>>>> 8fa4cfba387257c18db04ac5074b8ecf2a7b5f86
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
          }
		 
	
   
    }
        
       
   
    
    

	}

}
