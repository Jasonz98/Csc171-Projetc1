
public class Test {
  public static void main(String[]args) {
	  //
	  Person jason = new Person("Jason", 19, 5855034035l);
	  Person blank = new Person("Noname", 999, 0);
	  blank.setName("Magnificent");
	  System.out.println(jason.toString());
	  System.out.println(blank.toString());
	  
	  //
	  Element hydrogen = new Element("Hydrogen", "H", 1 , 1.008);
	  Element helium = new Element("Helium", "He", 2 , 4.002602);
	  helium.setAnum(110);
	  System.out.println(hydrogen.toString());
	  System.out.println(helium.toString());
	  
	  //
	  Animal tiger = new Animal("Tiger", "P. tigris");
	  Animal panda = new Animal("Panda",  "A.melanoleuca");
	  tiger.setName("Dragon");
	  System.out.println(tiger.toString());
	  System.out.println(panda.toString());
	  tiger.eat();
	  
	  //
	  BaseballP HBryce = new BaseballP ("Bryce Harper", 100 , 200 ,300, 400);
	  BaseballP RBabe = new BaseballP ("Babe Ruth", 400, 300 ,200 ,100);
	  HBryce.setNbats(299);
	  System.out.println(HBryce.toString());
	  HBryce.battingAverage();
	  RBabe.runsPerGame();
	  
  }
}
