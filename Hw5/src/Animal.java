
public class Animal {
   public String name;
   public String species;
   
   public Animal(String name, String species) {
	   this.name = name;
	   this.species = species;
   }
   
   public String toString() {
	   return ""+name+" belong to "+species+"";
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   
   public String getName() {
	   return name;
   }
   
   public void setSpecies(String species) {
	   this.species = species;
   }
   
   public String getSpecies() {
	   return species;
   }
   
   public void eat() {
	   System.out.println(name + " can eat");
   }
}
