import java.util.Objects;

public class Book
{
  /**
   * A constructor for the Book class.
   *
   * @param title The title of the book.
   * @param author The author of the book.
   * @param bookRating The rating of the book.
   */
  private String title;
  private String author;
  private int bookRating;


  public Book(String title, String author, int rating)
  {
    this.title = title;
    this.author = author;
    this.bookRating = (rating >= 1 && rating <= 10) ? rating : 0;
  }

  public Book(String title, String author)
  {
    this.title = title;
    this.author = author;
  }


  /**
    *  Gets the title of the book.
    *
    * @return The title of the book.
    */
 
  public String getTitle() {
    return this.title;
  }


  /**
    *  Gets the author of the book.
    *
    * @return The author of the book.
    */


  public String getAuthor() {
    return this.author;
  }


  /**
    *  Gets the rating of the book.
    *
    * @return The rating of the book.
    */


  public int getRating() {
    return this.bookRating;
  }


  /**
    * Sets the title of the book.
    *
    * @param name The title of the book.
    */
 
  public void setTitle(String title) {
    this.title = title;
  }


  /**
    * Sets the author of the book.
    *
    * @param name The author of the book.
    */
 
  public void setAuthor(String author) {
    this.author = author;
  }


  /**
    * Sets the rating of the book.
    *
    * @param name The rating of the book.
    */
 
  public void setRating(int rating) {
    if (rating >= 1 && rating <= 10) {
      this.bookRating = rating;
    }
  }

  public void adjustRating(int change) {
    int newRating = this.bookRating + change;
    if (newRating >= 1 && newRating <= 10) {
      this.bookRating = newRating;
    }
  }

  // added equals and hashCode so tests comparing Books by title+author succeed
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return Objects.equals(this.title, book.title)
        && Objects.equals(this.author, book.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.title, this.author);
  }
  
  public String toString()
  {
    String info = "\"" + this.title + "\", written by " + this.author;
    if (this.bookRating >= 1 && this.bookRating <= 10)
      info += ", rating " + this.bookRating;
    return info;
  }
}
