
import java.util.Objects;

public class Song {
    private String name;
    private String author;
    private double duration;

    public Song(String name, String author, double duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getDuration() {
        return this.duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(this.name, song.name)
            && Objects.equals(this.author, song.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.author);
    }
    

    public String toString()
    {
        String info = "\"" + this.name + "\", by " + this.author;
        if (this.duration > 0) {
         info += ", duration " + this.duration + " mins.";
        }
        return info;
    }


}
