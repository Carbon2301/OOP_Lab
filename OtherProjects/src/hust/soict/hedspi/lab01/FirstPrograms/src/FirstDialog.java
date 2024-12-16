package hust.soict.hedspi.lab01.FirstPrograms.src;//Example 2 : FirstDialog.java
import javax.swing.JOptionPane; // Import thư viện để hiển thị các hộp thoại thông báo

public class FirstDialog { // Khai báo lớp FirstDialog

    public static void main(String[] args) { // Phương thức chính, là điểm bắt đầu khi chương trình Java chạy

        JOptionPane.showMessageDialog(null, "Trinh Huu An  - 20225593 - Hello world! How are you?");
        // Hiển thị hộp thoại và in thông điệp
        System.exit(0);
        // Kết thúc chương trình với mã trạng thái 0
    }

}
