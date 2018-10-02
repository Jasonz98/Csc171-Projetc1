import java.util.Random;
import java.util.Scanner;
public class project1 {

	public static void main(String[] args) {
    
	//Initialize
	Random rand = new Random();
    	Scanner scan = new Scanner(System.in);
    	
     int score = 0; 
     System.out.println("Enter start/quit to start the game or leave");
  	 String control = scan.nextLine();
     
  	 while ( control.equals("start")) {
  		 score--;
   	
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
         
		 
	 //double difference;
	 double percent_difference;
		 
	 //difference = h-y;
	 percent_difference = Math.abs(h-y)/h;
		 
	 	if ((y>h)&&(percent_difference<=0.1)){
		 System.out.println("You made it!");
		 score += 4;
		}
		else if ((y>h)&&(percent_difference>=0.1)){
		 System.out.println("Plenty of room! ");
		 score += 2;
		}
		else if ((y<h)&&(percent_difference<=0.1)){
		 System.out.println("Not quite over!");	
		 score -= 1;
		}
		else if ((y<h)&&(percent_difference>=0.1)){
		 System.out.println("Not even close!");
	         score -= 3;
		}
		 System.out.println("Your current score is:" + score);
		 
		 System.out.println("Do you want to play again? yes/no");
	  	 String control2 = scan.next();
	  	 
	  	 if (control2.equals("yes")) {
	  		 System.out.println("Let's start!");
	  	 }else if (control2.equals("no")) {
	  	     break;
	  	 }
        }
  	     
  	     
  	     
   
    }
        
       
   
    
    

}


