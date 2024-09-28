import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // Hiển thị hộp thoại xác nhận với người dùng và lưu kết quả lựa chọn vào biến option
        int option = JOptionPane.showConfirmDialog(null,
                "(AnTH - 20225593)Do you want to change the first class ticket?");

        // Hiển thị một thông báo dựa trên kết quả lựa chọn của người dùng (Yes hoặc No)
        JOptionPane.showMessageDialog(null, "You have chosen: " +
                (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        // Nếu người dùng chọn "Yes", in "Yes", ngược lại in "No"

        // Kết thúc chương trình:
        System.exit(0);
    }
}
