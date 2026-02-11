/*
 * Activity 2.2.9
 */
import java.util.ArrayList;

public class MediaLib
{
  public static String owner = "PLTW";
  
  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;
  
  private ArrayList<Book> books;
  private ArrayList<Movie> movies;
  private ArrayList<Song> songs;
  
  public MediaLib()
  {
    books = new ArrayList<>();
    movies = new ArrayList<>();
    songs = new ArrayList<>();
  }
  
  public void addBook(Book b)
  {
    if (!books.contains(b))
    {
      books.add(b);
      numEntries++;
      numBooks++;
    } 
    else
      System.out.println("Cannot add a new book: \"" + b.getTitle() + "\" by " + b.getAuthor() + " already exists");
  }
  
  public void addMovie(Movie m)
  {
    if (!movies.contains(m))
    {
      movies.add(m);
      numEntries++;
      numMovies++;
    }
    else
      System.out.println("Cannot add a new movie: A movie already exists");
  }
  
  public void addSong(Song s)
  {
    if (!songs.contains(s))
    {
      songs.add(s);
      numEntries++;
      numSongs++;
    }
    else
      System.out.println("Cannot add a new song: A song already exists");
  }

  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }
  
  public static int getNumEntries()
  {
    return numEntries;
  }
  
  public static int getNumBooks()
  {
    return numBooks;
  }
  
  public static int getNumMovies()
  {
    return numMovies;
  }
  
  public static int getNumSongs()
  {
    return numSongs;
  }

  public int getTotalEntries() {
    return numEntries;
  }
  
  public String toString() 
  {
    String info = "";
    
    for (Book b : books)
      info += "Book: " + b + "\n";
    for (Movie m : movies)
      info += "Movie: " + m + "\n";
    for (Song s : songs)
      info += "Song: " + s + "\n";
 
    return info;
  }
}
