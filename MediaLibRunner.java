public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");

    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien", 3);
    Book b = new Book("Curious George", "H.A. Rey and Margret Rey");
    System.out.println("Book created: " + myBook);

    myBook.setRating(7);
    myLib.addBook(myBook);

    
    /*      Creation of new library with a new book
    MediaLib myLib2 = new MediaLib();
    Book myBook2 = new Book("Pancho Villa", "Unknown");
    myLib2.addBook(myBook2);
    myBook2.setTitle("Mr.Liu"); //singularis
    myLib2.addBook(new Book("Myself", "Muself Yav"));
    */

    Movie myMovie = new Movie("Nacho Libre", 125, 4);
    System.out.println("Movie created: " + myMovie);

    myMovie.setRating(4);
    myLib.addMovie(myMovie);

    Song mySong = new Song("Sunshine", "Steve Lacy and Foushee", 4.54);
    System.out.println("Song created: " + mySong);
    myLib.addSong(mySong);

    System.out.println("---------LIBRARY LIST---------");
    System.out.println(myLib);
  }
}
