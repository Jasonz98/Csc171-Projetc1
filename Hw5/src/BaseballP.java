
public class BaseballP {
    public String name;
    public int gplayed;
    public int nbats;
    public int nhits;
    public int nruns;
    
    public BaseballP(String name, int gplayed, int nbats, int nhits, int nruns) {
    	this.name = name;
    	this.gplayed = gplayed;
    	this.nbats = nbats;
    	this.nhits = nhits;
    	this.nruns = nruns;
    }
    
    public String toString() {
    	return "During his career, "+name+" played "+gplayed+" games, had "+nbats+" bats , made "+nhits+" hits, scored "+nruns+" runs";
    	}
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setGplayed(int gplayed) {
    	this.gplayed = gplayed;
    }
    
    public int getGplayed() {
    	return gplayed;
    }
    
    public void setNbats(int nbats) {
    	this.nbats = nbats;
    }
    
    public int getNbats() {
    	return nbats;
    }
    
    public void setNhits(int nhits) {
    	this.nhits = nhits;
    }
    
    public int getNhits() {
    	return nhits;
    }
    
    public void setNruns(int nruns) {
    	this.nruns = nruns;
    }
    
    public int getNruns() {
    	return nruns;
    }
    
    public void battingAverage() {
    	double a = (double)nhits / nbats;
    	System.out.println(name + "'s batting average is:" + a);
    }
    
    public void runsPerGame() {
    	double b = (double)nruns / gplayed;
    	System.out.println(name + "'s runs per game is:" + b);
    }
}
