package hust.soict.hedspi.aims.media;
//Trinh Huu An 20225593
public class DigitalVideoDisc extends Disc implements Playable {

    private static int nbDigitalVideoDiscs = 1;

    public DigitalVideoDisc(String title) {
        super(nbMedia++, title, null, 0, 0, null);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(nbMedia++, title, category, cost, 0, null);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(nbMedia++, title, category, cost, 0, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(nbMedia++, title, category, cost, length, director);
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    @Override
    public String toString() {
        return "DigitalVideoDisc: " +
                "id = " + getId() +
                " - title = '" + getTitle() + '\'' +
                " - category = '" + getCategory() + '\'' +
                " - cost = " + getCost() +
                " - length = " + getLength() +
                " - director = '" + getDirector() + '\'';
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());

        if (getLength() == 0) System.out.println("DVD cannot be played.");
        else System.out.println("DVD length: " + getLength());
    }

    @Override
    public int compareTo(Media other) {
        if (!(other instanceof DigitalVideoDisc)) return super.compareTo(other);

        DigitalVideoDisc otherDVD = (DigitalVideoDisc) other;

        int titleComparison = this.getTitle().compareTo(other.getTitle());
        if (titleComparison != 0) return titleComparison;

        if (this.getLength() == otherDVD.getLength()) return Float.compare(otherDVD.getCost(), this.getCost());

        return Integer.compare(otherDVD.getLength(), this.getLength());
    }

}
