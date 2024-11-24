import javax.swing.JOptionPane; // Import thư viện để sử dụng các hộp thoại nhập và thông báo

public class HelloNameDialog { // Khai báo lớp HelloNameDialog

    public static void main(String[] args) {
        String result; // Khai báo biến chuỗi, lưu kết quả người dùng nhập vào

        // Hiển thị hộp thoại nhập và lưu tên người dùng vào biến "result":
        result = JOptionPane.showInputDialog("Trinh Huu An - 20225593 - Please enter your name:");

        // Hiển thị hộp thoại thông báo với thông điệp chào mừng dựa trên tên người dùng vừa nhập:
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");

        // Kết thúc chương trình:
        System.exit(0);
    }

}
