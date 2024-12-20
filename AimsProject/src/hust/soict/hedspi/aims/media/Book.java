package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
//Trinh Huu An 20225593
public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, float cost) {
        super( title, category, cost);
    }

    public void addAuthor(String authorName){
        if(authors.contains(authorName)){
            System.out.println("Author is already in the list");
            return;
        }else{
            authors.add(authorName);
            System.out.println("Added author successfully");
        }
    }

    public void removeAuthor(String authorName){
        if(!authors.contains(authorName)){
            System.out.println("Author is not on the list");
        }else{
            authors.remove(authorName);
            System.out.println("Remove author successfully");
        }
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
