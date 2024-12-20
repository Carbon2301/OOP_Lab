package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

//Trinh Huu An 20225593
public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDisc = 0;

    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost, director, length);
        nbDigitalVideoDisc++;  // Increment the count each time a new DVD is created
    }

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    public static void setNbDigitalVideoDisc(int nbDigitalVideoDisc) {
        DigitalVideoDisc.nbDigitalVideoDisc = nbDigitalVideoDisc;
    }

    @Override
    public void play() throws PlayerException {
        if (getLength() <= 0) {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        } else {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }
    }
}
