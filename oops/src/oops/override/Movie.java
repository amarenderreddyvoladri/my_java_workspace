package oops.override;

public class Movie {
	
	int movieId;
	String movieName;
	String movieDirector;
	
	
	public Movie(int movieId, String movieName, String movieDirector) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
	}
	
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDirector=" + movieDirector + "]";
	}
	
	
	
}
