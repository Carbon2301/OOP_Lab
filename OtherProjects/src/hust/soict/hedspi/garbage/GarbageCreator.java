package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//Trinh Huu An 20225593
public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "C:/CODE/IT3103.744527.2024.1.20225593.TrinhHuuAn/OtherProjects/src/hust/soict/hust.soict.hedspi/garbage/test.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}