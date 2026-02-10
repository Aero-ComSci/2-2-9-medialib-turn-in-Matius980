public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;

  public void addBook(Book b)
  {
    this.book = b;
  }

  public void addMovie(Movie m)
  {
    this.movie = m;
  }

  public void addSong(Song s)
  {
    this.song = s;
  }


  public String toString()
  {
    String info = "";

    if (this.book != null)
      info += "Book: " + this.book;

    if (this.movie != null)
      info += "\nMovie: " + this.movie;

    if (this.song != null)
      info += "\nSong: " + this.song;

    return info;
  }
}
