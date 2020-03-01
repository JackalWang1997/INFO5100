package assignment6;

import java.util.ArrayList;

public class Mreview implements Comparable{
    private String title;
    private ArrayList<Integer> ratings;

	public Mreview() {
		
	}
	public Mreview(String title) {
		 this.title= title;
	}
	public Mreview(String title,int firstRating) {
		this.title=title;
		ratings=new ArrayList<>();
		ratings.add(firstRating);
	}
	
	public java.lang.Object getTitle(){
		return title;
		
	}
	public void addRating(int r) {
		ratings.add(r);
	}
	public double aveRating(){
		  double sum=0;
		  for(Integer i : ratings){
			  sum+=i;
		  }
		  return sum/ratings.size();
	  } 
	public int numRatings() {
		return ratings.size();
	}
	public int compareTo(Mreview obj) 
	  {
		  int result = title.compareTo(obj.title);
	      if (result > 0) { 
	    	  return 1; 
	      }
	      else if (result < 0){ 
	    	  return -1; 
	      }
	      else { 
	    	  return 0; 
	      }
	  }
	public String toString(){

		  StringBuilder sb=new StringBuilder(10);

		  for(Integer i : ratings){

			  sb.append(i).append(", ");

		  }

		  return title+" \n"+sb.toString();

	  }
	public boolean equals(Object o){
		  if (o == this) {
	          return true;
	      }
	      if (!(o instanceof Mreview)) {
	          return false;
	      }
	       
	      Mreview m = (Mreview) o;
	       
	      return title.equals(m.title);

	  }
	public static void main(String[] arg) {
		Mreview m=new Mreview("Kill Bill",3);
		m.addRating(3);
		m.addRating(4);
		m.addRating(5);
		System.out.println(m.toString());
		System.out.println(m.aveRating());
	  }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	}
	

