
public class Element {
   public String name;
   public String symbol;
   public int anum;
   public double aweight;
   
   public Element (String name, String symbol, int anum, double aweight) {
	   this.name = name;
	   this.symbol = symbol;
	   this.anum = anum;
	   this.aweight = aweight;
	   }
   
   public String toString() {
	   return ""+name+", "+symbol+" ,has atomic number: "+anum+" and atomic weight:"+aweight+"";
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   
   public String getName() {
	   return name;
   }
   
   public void setsymbol(String symbol) {
	   this.symbol = symbol;
   }
   
   public String getsymbol() {
	   return symbol;
   }
   
   public void setAnum(int anum) {
	   this.anum = anum;
   }
   
   public int getAnum() {
	   return anum;
   }
   
   public void setAweight(double aweight) {
	   this.aweight = aweight;
   }
   
   public double getAweight() {
	   return aweight;
   }
}
