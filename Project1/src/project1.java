import java.util.Random;
import java.util.Scanner;
public class project1 {

	public static void main(String[] args) {
    
	   //Initialize
	   Random rand = new Random();
       Scanner scan = new Scanner(System.in);
       
       String[] z = { "You made it", "Nice work", "Bravo"};
       
       
       //Variable to track score
       int score = 1; 
       
       //Instruction
       System.out.println("This is a TTY game. You have a catapult that can launch projectiles.");
       System.out.println("Your goal is to let your projectile fly pass the wall.");
       System.out.println("At the start of each round, you will be informed of the height of the wall and the distance from it.");
       System.out.println("You will then be asked to input an angle and an intial speed.");
       System.out.println("The computer will compute whether you make it over the wall.");
       System.out.println("You have 0 point at the start and each round cost you 1 point");
       System.out.println("You earn points each time clearing the wall and lose point hitting the wall");
       System.out.println("Point earned or lost  vary slightly based on the distance from the top of the wall");
       System.out.println("You will be informed of you score at the start and the end of a round");
       System.out.println("Now, enter 'start' to start the game!");
       
       //Start the game
  	   String control = scan.next();
     
  	   while ( control.equals("start")) {
  		    
  		   score--;
  		   System.out.println("Your current score is:" + score);
   	       
  		   //Create random distance and height
  		   int d = rand.nextInt(20);
    	   int h = rand.nextInt(20);
		 
    	   //Inform player of the current height and distance
           System.out.println("The current distance to the wall is:" + d +"m" );
           System.out.println("The current height of the wall is:" + h + "m");	
           
           //Prompt for an angle
           System.out.print("Please enter an angle between 0 - 90 degrees: ");
		   double angle = scan.nextDouble(); 
        
           //In case a player input an angle above 90 degrees
           if (angle >= 90) {
        	 System.out.println("Your projectile will fly backward!");
        	 System.out.println("Please enter an angle between 0 - 90 degrees:");
        	 angle = scan.nextDouble();
            }
           
           //Change angle to radian form
           double radians = Math.toRadians(angle);
           
           //Prompt for a speed
           System.out.print("Please enter a speed: ");
           int v = scan.nextInt();
           
           //Calculate whether the player makes it
           double y = d *  Math.tan(radians) - (9.8 * d * d)/ (2 * (Math.pow(v * Math.cos(radians), 2)));
         
		 
	       //double difference;
	       double pd = Math.abs(h-y) / h;
		 
	
		   //We use percentage difference to determine the points given
	       //If the distance between the projectile and the top of the wall is less than 10 percent of the wall height
	       //The player gets better score
	 	   if ((y > h) && (pd <= 0.1)){
		     int index = rand.nextInt(z.length);
		     System.out.println(z[index]);
		     score += 5;
		   } else if ((y > h) && (pd >= 0.1)){
			   int index = rand.nextInt(z.length);
			    System.out.println(z[index]);
		   } else if ((y < h) && (pd <= 0.1)){
		     System.out.println("Not quite over!");	
		   } else if ((y < h) && ( pd >= 0.1)){
		     System.out.println("Not even close!");
	         score -= 2;
		   }
		 
	 	   
	 	   System.out.println("Your current score is:" + score);
		   System.out.println("Do you want to play again? yes/no: ");
	  	   
		   
		   String control2 = scan.next();
	  	   if (control2.equals("yes")) {
	  		 System.out.println("Let's start!");
	  	   }else if (control2.equals("no")) {
	  	     break;
	  	   }
        }
  	     
  	     
  	     
   
    }
        
       
   
    
    

}


