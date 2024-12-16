package hust.soict.hedspi.lab01.JavaBasics.src;

import java.util.Scanner;
//Thêm thư viện để xài Scanner
public class InputFromKeyboard {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Trinh Huu An - 20225593");
        // In ra câu hỏi "Tên bạn là gì?" và chờ người dùng nhập tên
        System.out.println("What is your name?");
        // Đọc một chuỗi nhập từ bàn phím (tên của người dùng) và gán vào biến strName
        String strName = keyboard.nextLine();

        // In ra câu hỏi "Bạn bao nhiêu tuổi?" và chờ người dùng nhập tuổi
        System.out.println("How old are you?");
        // Đọc một số nguyên từ bàn phím (tuổi của người dùng) và gán vào biến iAge
        int iAge = keyboard.nextInt();

        // In ra câu hỏi "Bạn cao bao nhiêu (mét)?" và chờ người dùng nhập chiều cao
        System.out.println("How tall(m) are you?");
        // Đọc một số thực từ bàn phím (chiều cao của người dùng) và gán vào biến dHeight
        double dHeight = keyboard.nextDouble();

        // In ra thông tin người dùng bao gồm tên, tuổi và chiều cao
        System.out.println("Mr/Mrs " + strName + ", " + iAge + " years old. " +
                "Your height is: " + dHeight + ".");
    }
}
