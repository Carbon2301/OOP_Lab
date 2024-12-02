package hust.soict.hedspi.aims.media;
// Trinh Huu An 20225593
import java.util.Objects;

public class Track implements Playable {
    private String title;
    private int length;

    public Track() {
        super();
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + getTitle());
        if (getLength() == 0) System.out.println("Track cannot be played.");
        else System.out.println("Track length: " + getLength());
    }


    @Override
    public String toString() {
        return "Track: " +
                "title = '" + title + '\'' +
                " - length = " + length;
    }
}
