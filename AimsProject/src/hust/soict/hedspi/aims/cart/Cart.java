package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
//    Trinh Huu An 20225593
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc '" + disc.getTitle() + "' has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                System.out.println("The disc has been added.");
            } else {
                System.out.println("The cart is almost full.");
            }
        }
    }
//        public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
//        for (int i = 0; i < dvdList.length; i++) {
//            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
//                itemsOrdered[qtyOrdered] = dvdList[i];
//                qtyOrdered++;
//                System.out.println("The disc has been added.");
//            } else {
//                System.out.println("The cart is almost full.");
//            }
//        }
//    }

//    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
//            itemsOrdered[qtyOrdered] = dvd1;
//            itemsOrdered[qtyOrdered + 1] = dvd2;
//            qtyOrdered += 2;
//            System.out.println("The disc " + dvd1.getTitle() + " and " + dvd2.getTitle() + " has been added.");
//        } else {
//            System.out.println("The cart is almost full.");
//        }
//    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int check = MAX_NUMBERS_ORDERED + 1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle()))
                check = i;
        }

        if (check != MAX_NUMBERS_ORDERED + 1) {
            for (int i = check; i < qtyOrdered; i++)
                itemsOrdered[i] = itemsOrdered[i + 1];

            System.out.println("The disc '" + disc.getTitle() + "' has been removed.");
            qtyOrdered--;
        }
    }

    public float totalCost() {
        float totalCost = 0;
        for(int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }

        return totalCost;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("**************************************************");
    }

    public boolean search(int id) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public DigitalVideoDisc getDiscById(int id) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.getId() == id) {
                return disc;
            }
        }
        return null;
    }

    public boolean search(String title) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.isMatch(title)) {
                return true;
            }
        }
        return false;
    }

    public DigitalVideoDisc getDiscByTitle(String title) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.isMatch(title)) {
                return disc;
            }
        }
        return null;
    }


}