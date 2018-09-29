import java.util.Scanner;
import java.lang.String;

public class Hw6_4 {
  public static void main(String[]args) {
	  Scanner scan = new Scanner(System.in);
	  String a = scan.nextLine();
	  String b = scan.nextLine();

	  if (a.equals(b)) {
		  System.out.println("The two strings are equal");
  }else if(a.startsWith(b)) {
	  System.out.println("String a starts with String b");
  }else if(a.endsWith(b)) {
	  System.out.println("String a ends with String b");
  }else if(a.contains(b)) {
	  System.out.println("String a contains String b");
	  }else {
	  System.out.println("They don't have any connection");
	  }
	  
  }
}
