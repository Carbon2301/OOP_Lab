//import hust.soict.hedspi.aims.media.DigitalVideoDisc;
//
//public class TestPassingParameter {
//    public static void main(String[] args){
//        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", "Sci-Fi", "Wachowski Sisters", 136, 19.99f);
//        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", "Romance", "Wachowski Brothers", 136, 19.99f);
//
//        swap(jungleDVD, cinderellaDVD);
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
//
//        changeTitle(jungleDVD, cinderellaDVD.getTitle());
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//        System.out.println("Trinh Huu An 20225593");
//    }
//    public static void swap(Object o1, Object o2){
//        Object temp = o1;
//        o1 = o2;
//        o2 = temp;
//    }
//
//    public static void changeTitle(DigitalVideoDisc dvd, String title){
//        String oldTile = dvd.getTitle();
//        String oldCategory = dvd.getCategory();
//        String oldDirector = dvd.getDirector();
//        int oldLength = dvd.getLength();
//        float oldCost = dvd.getCost();
//
//        dvd.setTitle(title);
//        dvd = new DigitalVideoDisc(oldTile, oldCategory, oldDirector, oldLength, oldCost);
//    }
//}
