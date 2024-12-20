package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
//Trinh Huu An 20225593
public class Store {
    private ArrayList<Media> itemsAvailable = new ArrayList<Media>();

    public void addMedia(Media media){
        itemsAvailable.add(media);
        System.out.println("Added successfully");
    }

    public void removeMedia(Media media){
        if(!itemsAvailable.contains(media)){
            System.out.println("The selected items is not in the cart");
            return;
        }else{
            itemsAvailable.remove(media);
            System.out.println("Removed successfully");
        }
    }

    public void print(){
        System.out.println("************************************LIST OF ITEMS IN STORE********************************");
        for(Media media : this.itemsAvailable){
            System.out.println(media.toString());
        }
        System.out.println("******************************************************************************************");
    }

    public Media findMediaById(int id){
        for (Media media : this.itemsAvailable){
            if(media.getId() == id){
                return media;
            };
        }
        return null;
    }

    public void printMedia(Media media){
        System.out.println(media.toString());
    }

    public Media findMediaByTitle(String title){
        String regex = "^[a-zA-Z 0-9]+$";
        if(title.matches(regex)){
            for (Media media: this.itemsAvailable){
                if (media.getTitle().equals(title)){
                    printMedia(media);
                    return media;
                }
            }
        }else{
            System.out.println("Invalid title");
            return null;
        }
        return null;
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsAvailable;
    }

}
