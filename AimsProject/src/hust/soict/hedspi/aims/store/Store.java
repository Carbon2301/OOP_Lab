package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
//Trinh Huu An 20225593
public class Store {
    private DigitalVideoDisc[] itemsInStore;  // Mảng DVD có sẵn trong cửa hàng
    private int numItems; // Số lượng DVD hiện có trong cửa hàng

    public Store() {
        itemsInStore = new DigitalVideoDisc[100];  // Giả sử cửa hàng có thể chứa tối đa 100 DVD
        numItems = 0;
    }

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        if (numItems < itemsInStore.length) {
            itemsInStore[numItems] = dvd;
            numItems++;
            System.out.println("DVD added: " + dvd.getTitle());
        } else {
            System.out.println("Store is full, cannot add more DVDs.");
        }
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < numItems; i++) {
            if (itemsInStore[i].getId() == dvd.getId()) {  // So sánh theo ID
                for (int j = i; j < numItems - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];  // Dịch các phần tử về trước
                }
                itemsInStore[numItems - 1] = null;  // Xóa phần tử cuối cùng
                numItems--;
                System.out.println("DVD removed: " + dvd.getTitle());
                return;
            }
        }
        System.out.println("DVD not found in the store.");
    }

    // Phương thức in ra danh sách các DVD trong cửa hàng
    public void printStore() {
        System.out.println("*************** Store Inventory ***************");
        for (int i = 0; i < numItems; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i]);
        }
        System.out.println("**********************************************");
    }
}
