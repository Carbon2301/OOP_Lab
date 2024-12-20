package hust.soict.hedspi.aims.media;

import java.util.Comparator;
//Trinh Huu An 20225593
public class MediaComparatorByTitleCost implements Comparator<Media> {
    public int compare(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());

        if (titleComparison != 0) {
            return titleComparison;
        }

        return Float.compare(media2.getCost(), media1.getCost());
    }
}
