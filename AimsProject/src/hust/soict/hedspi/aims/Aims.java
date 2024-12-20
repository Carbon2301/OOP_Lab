package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.screen.CartScreen;
import hust.soict.hedspi.aims.screen.StoreScreen;
//Trinh Huu An 20225593
public class Aims {

    private static Scanner sc;
    private static Store store;
    private static Cart cart;
    private static StoreScreen storeScreen;
    private static CartScreen cartScreen;

    public static void main(String[] args) {
        store = new Store();
        cart = new Cart();

        Media[] sampleMedia = new Media[]{
                new CompactDisc("Summer Vibes 2024", "Pop", 14.49f, "Ariana Grande", 210, "Ariana Grande"),
                new CompactDisc("Classic Collection", "Classical", 18.99f, "Ludwig van Beethoven", 250, "Beethoven"),
                new DigitalVideoDisc("Epic Movie Moments", "Action", 16.49f, "Michael Bay", 135),
                new Book("The Invisible Man", "Science Fiction", 11.29f),
        };

        for (Media m : sampleMedia) {
            store.addMedia(m);
        }

        openStoreScreen();
    }

    public static Store getStore() {
        return store;
    }

    public static Cart getCart() {
        return cart;
    }

    public static StoreScreen getStoreScreen() {
        return storeScreen;
    }

    public static CartScreen getCartScreen() {
        return cartScreen;
    }

    public static void openStoreScreen() {
        storeScreen = new StoreScreen(store);
    }

    public static void closeStoreScreen() {
        storeScreen.setVisible(false);
        storeScreen = null;
    }

    public static void openCartScreen() {
        cartScreen = new CartScreen(cart);
    }

    public static void closeCartScreen() {
        cartScreen.setVisible(false);
        cartScreen = null;
    }

}