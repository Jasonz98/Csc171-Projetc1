import java.util.Scanner;
import java.util.Random;

public class Projectiles {
	
	
	public static int score = 0;
	
	public static void main(String[] args) {
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
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
	
		int h;
		int x;
		double thetaD;
		double speed;
		boolean round = true;
		boolean game = true;
	
		while (game == true) {
			//generate random numbers from 1 to 20
			h = 1 + ran.nextInt(20);
			x = 1 + ran.nextInt(20);
			
			System.out.printf("Height of the wall is %d%n", h);
			System.out.printf("Distance of the wall is %d%n", x);
			
			while (round == true) {
				System.out.print("Please set a launch angle in degree: ");
				thetaD = sc.nextDouble();
				System.out.print("Please set a launch speed: ");
				speed = sc.nextDouble();	
				
				
				boolean win = launch(h, x, thetaD, speed);
				
				if (win == false) {
					System.out.println("Do you want to try again? (true/false)");
					boolean answer = sc.nextBoolean();
					if (answer == false){
						round = false;			
					}
				}
				else
					System.out.print("Do you wish to continue? (true/false)");
				    boolean loop = sc.nextBoolean();
				    if (loop == false){
				    round = false;
				    }
				    else{
				    round = true;
				    }
			}
			game = false;
		} 
		System.out.printf("Your final score is %d%n", score);
		sc.close();
	}
	
	//declare a static method that performs one launch
	public static boolean launch(int h, int x, double thetaD, double speed) {
		
		boolean win = true;
		score -= 1;		
		double thetaR = thetaD * Math.PI / 180;
		double y = x*Math.tan(thetaR) - (9.8*x*x) / (2* Math.pow(speed * Math.cos(thetaR), 2));
		double pd = Math.abs(h-y) / h;
		
		if ((y > h) && (pd >= 0.1))
		{	
			System.out.println("Plenty of room!");
			score += 5;
			
		}	
		else if ((y > h) && (pd <= 0.1))
		{
			System.out.println("You made it!");
			score += 3;
			
		}	
		else if ((y < h) && (pd <= 0.1))
		{	
			System.out.println("Not quite over.");
			win = false;
			
		}	
		else if ((y < h) && ( pd >= 0.1))
		{	
			System.out.println("Not even close!");
			score -=2; 
			win = false;
			
		}
		return win;
	}
}
