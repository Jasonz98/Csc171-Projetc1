
public class Person {
   public String name;
   public int age;
   public long phone;
   
   public Person(String name, int age, long phone) {
	   this.name = name;
	   this.age = age;
	   this.phone = phone;
   }
   
   public String toString() {
	   return ""+name+" is "+age+" years old and has phone number:"+phone+"";
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   
   public String getName() {
	   return name;
   }
   
   public void setAge(int age) {
	   this.age = age;
   }
   
   public int getAge() {
	   return age;
   }
   
   public void setPhone(long phone) {
	   this.phone = phone;
   }
   
   public long getPhone() {
	   return phone;
   }


}
