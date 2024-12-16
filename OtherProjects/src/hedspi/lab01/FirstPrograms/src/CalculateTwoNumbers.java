package hedspi.lab01.FirstPrograms.src;

import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        // Khai báo hai biến kiểu chuỗi strNum1 và strNum2 để lưu số do người dùng nhập vào.

        strNum1 = JOptionPane.showInputDialog(null,"Please enter number 1: ", JOptionPane.INFORMATION_MESSAGE);
        // Hiển thị hộp thoại nhập để người dùng nhập số thứ nhất. Giá trị nhập sẽ được lưu dưới dạng chuỗi trong biến strNum1.

        double num1 = Double.parseDouble(strNum1);
        // Chuyển chuỗi strNum1 thành kiểu số thực (double) và lưu vào biến num1.

        strNum2 = JOptionPane.showInputDialog(null, "Please enter number 2: ", JOptionPane.INFORMATION_MESSAGE);
        // Hiển thị hộp thoại nhập để người dùng nhập số thứ hai. Giá trị nhập sẽ được lưu dưới dạng chuỗi trong biến strNum2.

        double num2 = Double.parseDouble(strNum2);
        // Chuyển chuỗi strNum2 thành kiểu số thực (double) và lưu vào biến num2.

        String resultMessage = "Trinh Huu An - 20225593\n" +
                "Tong cua 2 so la: " + (num1 + num2) + "\n" +
                "Hieu cua 2 so la: " + (num1 - num2) + "\n" +
                "Tich cua 2 so la: " + (num1 * num2) + "\n";
        // Tạo chuỗi kết quả cho tổng, hiệu, tích.

        // Kiểm tra ước số của phép chia:
        if (num2 != 0) {
            resultMessage += "Thuong cua 2 so la: " + (num1 / num2) + "\n";
            // Nếu num2 khác 0, thực hiện phép chia và thêm kết quả vào chuỗi thông báo.
        } else {
            resultMessage += "Khong the chia cho 0\n";
            // Nếu num2 bằng 0, hiển thị thông báo không thể chia cho 0.
        }

        JOptionPane.showMessageDialog(null, resultMessage, "Result", JOptionPane.INFORMATION_MESSAGE);
        // Hiển thị hộp thoại thông báo kết quả bao gồm tên người dùng và các phép toán đã thực hiện.

        System.exit(0);
    }
}
