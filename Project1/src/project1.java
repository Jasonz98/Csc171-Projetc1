import java.util.Random;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
    
	//Initialize
	Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    int a = 1;
    
    while ( a < 2 ) {
    System.out.println("Enter start to begin or enter quit to leave");
    System.out.println("Start/Quit?");
    String control = scan.nextLine();
    if (control.equals("quit")){
    	break;
    }else if (control.equals("start")) {
    
      int distance = rand.nextInt(50);
      int height = rand.nextInt(50);
        System.out.println("The current distance to the wall is:" + distance );
        System.out.println("The current height of the wall is:" + height);	
   
        System.out.println("Please enter an angle from 0 - 90 Degrees");
          int angel = scan.nextInt(); 

        System.out.println("Please enter a speed");
          int speed = scan.nextInt();
          }
   
    }
        
       
   
    
    

	}

}
