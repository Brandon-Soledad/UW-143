import java.util.Comparator;

public class Movie implements Comparable<Movie>{
	private String title;
	private int year;
	
	public Movie(String title, int year){
		if(title == null){
			throw new NullPointerException("There is no title");
		}
		if(year < 0){
			throw new IllegalArgumentException("Year must be positive");
		}
		this.setTitle(title);
		this.setYear(year);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString(){
		return "Movie title: " + this.title + ", " + "Movie year: " + this.year;
	}
	
	public boolean equals(Movie a){
		if(a == null){
			throw new NullPointerException("Movie object is null");
		}
		if(this == a){
            return true; 
		}
        if(a.getClass()!= this.getClass()){
            return false; 
        }
        
        return (a.title == this.title && a.year == this.year); 
	}

	public int compareTo(Movie b) {
		if(this.year == b.year){
			return this.year - b.year;
		}
		else{
			return this.year - b.year;
		}
	}

}

class MovieComparator implements Comparator<Movie>{
	public int compare(Movie a, Movie b){
		return a.compareTo(b);
	}
}
