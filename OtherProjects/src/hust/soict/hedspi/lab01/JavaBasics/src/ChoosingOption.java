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

//Cải tiến chương trình Choosing Option:
//import javax.swing.JOptionPane;
//
//public class ChoosingOption {
//    public static void main(String[] args) {
//        // Định nghĩa các tùy chọn tùy chỉnh
//        Object[] options = {"I do", "I don't"};
//
//        // Hiển thị hộp thoại tùy chỉnh với các tùy chọn đã định nghĩa
//        int option = JOptionPane.showOptionDialog(null,
//                "(AnTH - 20225593) Do you want to change the first class ticket?",
//                "Chosen option",  // Tiêu đề của hộp thoại
//                JOptionPane.YES_NO_OPTION,  // Loại hộp thoại tùy chọn
//                JOptionPane.QUESTION_MESSAGE,  // Loại thông báo
//                null,  // Không có biểu tượng tùy chỉnh
//                options,  // Các nút tùy chỉnh
//                options[0]);  // Tùy chọn mặc định được chọn
//
//        // Hiển thị tùy chọn mà người dùng đã chọn
//        JOptionPane.showMessageDialog(null, "You have chosen: " +
//                (option == JOptionPane.YES_OPTION ? "I do" : "I don't"));
//
//        System.exit(0);
//    }
//}
