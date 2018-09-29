import java.util.Date;

public class Test {
   public static void main(String[]args) {
	   
	   //
	   Article a = new Article("Jason", new Date(118,9,28));
	   Article b = new Article("Bob");
	   a.setNlikes(5);
	   a.unlike();
	   System.out.println(a.toString());
	   System.out.println(b);
	   
	   //
	   Employee employee = new Employee ("Jason", "Zhang");
	   Employee employee2 = new Employee ("Bob", "Hu", 22222222, 1000);
	   employee.raise(0.1);
	   System.out.println(employee.toString());
	   System.out.println(employee2.toString());
	   
	   
   }
}
