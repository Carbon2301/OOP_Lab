package hust.soict.hedspi.aims.test.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.cart.Cart;
import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        cart.printCart();

        // Lựa chọn tìm kiếm theo ID hoặc tiêu đề
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose search type (1: By ID, 2: By Title): ");
        int searchType = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống sau nextInt()

        if (searchType == 1) {
            // Tìm kiếm theo ID
            System.out.println("Enter the ID of DVD you want to search: ");
            int idForSearch = sc.nextInt();

            if (cart.search(idForSearch)) {
                System.out.println("Found DVD with ID " + idForSearch + ":");
                System.out.println(cart.getDiscById(idForSearch));
            } else {
                System.out.println("Not found DVD with ID " + idForSearch);
            }
        } else if (searchType == 2) {
            // Tìm kiếm theo tiêu đề
            System.out.println("Enter the title of DVD you want to search: ");
            String titleForSearch = sc.nextLine();

            if (cart.search(titleForSearch)) {
                System.out.println("Found DVD with title \"" + titleForSearch + "\":");
                System.out.println(cart.getDiscByTitle(titleForSearch));
            } else {
                System.out.println("Not found DVD with title \"" + titleForSearch + "\"");
            }
        } else {
            System.out.println("Invalid search type. Please enter 1 or 2.");
        }

        sc.close();

    }
}