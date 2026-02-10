import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BookTest {
    @Test
    void makeBookTest(){
        Book b = new Book("A Wrinkle in Time", "M L'Engle");
        assertEquals("M L'Engle", b.getAuthor());
    
       
    }
     @Test
    void checkRatingTest(){
        Book b = new Book(" "," ");
        b.adjustRating(5);
        assertEquals(5, b.getRating());


    }
    @Test
    void checkEqualsTest(){
        Book b = new Book("A Wrinkle in Time", "M L'Engle");
        Book c = new Book("A Wrinkle in Time", "M L'Engle");
        assertEquals(true, b.equals(c));
    }
    @Test
    void testTheToStringTest(){
        Book b = new Book("", "");
        b.adjustRating(4);
        assertTrue(b.toString().contains("rating"), "The string should contain 'rating'");
    }

    @Test
    void testMovieClassTest(){
        Movie m = new Movie("Frankie", 1.2);
        assertEquals("Frankie", m.getTitle());
    }
    @Test
    void testTheToStringTest2(){
        Movie b = new Movie("", 1.3);
        b.adjustRating(100);
        assertEquals(0, b.getRating());
      
    }
    @Test
    void checkEqualsTest2(){
        Movie b = new Movie("A Wrinkle in Time", 1.2);
        Movie c = new Movie("A Wrinkle in Time", 1.2);
        assertEquals(true, b.equals(c));
    }


    }


