import java.util.Objects;

public class Movie
{


  /**
   * A constructor for the Movie class.
   *
   * @param title The title of the movie.
   * @param author The duration of the movie.
   * @param movieRating The rating of the movie.
   */
  private String title;
  private double duration;
  private int movieRating;


  public Movie(String title, double duration, int rating)
  {
    this.title = title;
    this.duration = duration;
    this.movieRating = (rating >= 1 && rating <= 10) ? rating : 0;
  }
  public Movie(String title, double duration) {
    this.title = title;
    this.duration = duration;
  }



  /**
    * Gets the name of the movie.
    *
    * @return The name of the movie.
    */
 
  public String getTitle() {
    return this.title;
  }


  /**
    *  Gets the duration of the movie.
    *
    * @return The duration of the movie.
    */
 
  public double getDuration() {
    return this.duration;
  }


  /**
    *  Gets the rating of the movie.
    *
    * @return The rating of the movie.
    */
 
  public int getRating() {
    return this.movieRating;
  }


  /**
    * Sets the title of the movie.
    *
    * @param name The title of the movie.
    */
 
  public void setTitle(String title) {
    this.title = title;
  }


  /**
    * Sets the duration of the movie.
    *
    * @param name The duration of the movie.
    */
 
  public void setDuration(double duration) {
    this.duration = duration;
  }
 
  /**
    * Sets the rating of the movie.
    *
    * @param name The rating of the movie.
    */
 
  public void setRating(int rating) {
    if (rating >= 1 && rating <= 10) {
      this.movieRating = rating;
    }
  }

  public void adjustRating(int change) {
    int newRating = this.movieRating + change;
    if (newRating >= 1 && newRating <= 10) {
      this.movieRating = newRating;
    }
  }
  
  // added equals and hashCode so tests comparing Movies by title+duration succeed
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Movie movie = (Movie) o;
    return Double.compare(movie.duration, this.duration) == 0
        && Objects.equals(this.title, movie.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.title, this.duration);
  }
  
  public String toString()
  {
    String info = "\"" + this.title + "\", duration " + this.duration + " mins";
    if (this.movieRating >= 1 && this.movieRating <= 10)
      info += ", rating " + this.movieRating;
    return info;
  }
}