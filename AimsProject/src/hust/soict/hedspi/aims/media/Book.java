package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
//Trinh Huu An 20225593
public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public Book(String title, String category, float cost) {
        super(nbMedia++, title, category, cost);
    }

    public void addAuthor(String authorName) {
        if(!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added");
        }
        else System.out.println("Author is already in the list");
    }

    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed");
        }
        else System.out.println("Author is not in the list");
    }

    @Override
    public String toString() {
        return "Book: " +
                "id = " + getId() +
                " - title = '" + getTitle() + '\'' +
                " - category = '" + getCategory() + '\'' +
                " - cost = " + getCost() +
                " - (List of) authors = " + authors;
    }

}
