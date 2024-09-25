//Example 5 : ShowTwoNumbers.java
import javax.swing.JOptionPane;
public class ShowTwoNumbers { // Khai báo lớp ShowTwoNumbers
    public static void main(String[] args) {
        String strNum1, strNum2; // Khai báo hai biến chuỗi để lưu hai số do người dùng nhập vào
        String strNotification = "Trinh Huu An - 20225593. You've just entered: "; // Khởi tạo chuỗi thông báo để hiển thị kết quả

        // Hiển thị hộp thoại nhập và lưu số đầu tiên vào biến "strNum1"
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE); // Hộp thoại nhập thông tin với tiêu đề và loại thông báo
        strNotification += strNum1 + " and "; // Cập nhật chuỗi thông báo với số đầu tiên

        // Hiển thị hộp thoại nhập và lưu số thứ hai vào biến "strNum2"
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE); // Hộp thoại nhập thông tin với tiêu đề và loại thông báo
        strNotification += strNum2; // Cập nhật chuỗi thông báo với số thứ hai

        // Hiển thị hộp thoại thông báo kết quả với hai số mà người dùng đã nhập
        JOptionPane.showMessageDialog(null, strNotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE); // Hiển thị thông báo với tiêu đề và loại thông báo

        // Kết thúc chương trình
        System.exit(0);
    }
}

