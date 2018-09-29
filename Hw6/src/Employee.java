
public class Employee {
   public String fname;
   public String lname;
   public long idn;
   public double salary;
   
   public Employee(String fname, String lname, long idn, double salary) {
	   this.fname = fname;
	   this.lname = lname;
	   this.idn = idn;
	   this.salary = salary;
   }
   
   public Employee (String fname, String lname) {
	   this.fname = fname;
	   this.lname = lname;
	   idn = 30697201;
	   salary = 2000;
   }
   
   public String toString() {
	   return "Employee "+fname+" "+lname+"'s id number is "+idn+", and has a salary of $"+salary+"";
   }
   
   public void setFname(String fname) {
	   this.fname = fname;
   }
   
   public String getFname() {
	   return fname;
   }
   
   public void setLname(String lname) {
	   this.lname = lname;
   }
   
   public String getLname() {
	   return lname;
   }
   
   public void setIdn(int idn) {
	   this.idn = idn;
   }
   
   public long getIdn() {
	   return idn;
   }
   
   public void setSalary(double salary) {
	   this.salary = salary;
   }
   
   public double getSalary() {
	   return salary;
   }
   
   public void raise (double a) {
	   salary = salary * (1 + a);
   }
}

