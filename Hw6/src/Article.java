import java.util.Date;

public class Article {
  public String author;
  public Date date;
  public String article;
  public int nlikes;
  
  Date cdate = new Date();
  
  public Article(String author, Date date) {
	  this.author = author;
	  this.date = date;
  }
  
  public Article(String author) {
	  this.author = author;
	  date = cdate;
  }
  
  public String toString() {
	  return ""+author+" posted the article on "+date.toString()+" and has "+nlikes+" likes ";
  }
  
  public void setAuthor(String author) {
	  this.author = author;
  }
  
  public String getAuthor() {
	  return author;
  }
  
  public void setDate(Date date) {
	  this.date = date;
  }
  
  public Date getDate() {
	  return date;
  }
  
  public void setArticle(String article) {
	  this.article = article;
  }
  
  public String getArticle() {
	  return article;
  }
  
  public void setNlikes(int nlikes) {
	  this.nlikes = nlikes;
  }
  
  public int getNlikes() {
	  return nlikes;
  }
  
  public void like() {
	  nlikes ++;
  }
  
  public void unlike() {
	  nlikes --;
  }
}
