import java.util.Scanner;

public class Exercise_2_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Hiển thị lựa chọn bài toán cho người dùng
            System.out.println("MENU (Trinh Huu An - 20225593):");
            System.out.println("1. Phương trình bậc một, 1 biến số");
            System.out.println("2. Hệ phương trình bậc một, 2 biến số");
            System.out.println("3. Phương trình bậc hai, 1 biến số");
            System.out.println("Chọn một dạng bài toán để giải (Nhấn ký tự khác để thoát): ");

            // Kiểm tra xem người dùng có nhập số hợp lệ không
            if (!sc.hasNextInt()) {  // Kiểm tra nếu nhập không phải là số
                System.out.println("Chương trình kết thúc.");
                break;  // Thoát khỏi vòng lặp nếu người dùng nhập ký tự khác số
            }

            int choice = sc.nextInt();  // Đọc lựa chọn của người dùng

            switch (choice) {
                case 1:
                    GiaiPTBacMotMotAn(sc);
                    break;
                case 2:
                    GiaiHePTBacMotHaiAn(sc);
                    break;
                case 3:
                    GiaiPTBacHaiMotAn(sc);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
        sc.close(); // Giải phóng tài nguyên sau khi sử dụng
    }

    // Giải phương trình bậc nhất: ax + b = 0
    private static void GiaiPTBacMotMotAn(Scanner sc) {
        System.out.println("Giải phương trình ax + b = 0");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();  // Đọc dữ liệu từ người dùng
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        // Kiểm tra nếu a = 0
        if (a == 0) {
            System.out.println("Lỗi: 'a' không thể bằng 0.");
        } else {
            double x = -b / a;  // Tính nghiệm
            System.out.println("Nghiệm của phương trình " + a + "x + " + b + " = 0 là x = " + x);
        }
    }

    // Giải hệ phương trình bậc nhất 2 ẩn
    // a11 * x1 + a12 * x2 = b1
    // a21 * x1 + a22 * x2 = b2
    private static void GiaiHePTBacMotHaiAn(Scanner sc) {
        System.out.println("Giải hệ phương trình bậc nhất 2 ẩn:");
        System.out.print("Nhập a11: ");
        double a11 = sc.nextDouble();
        System.out.print("Nhập a12: ");
        double a12 = sc.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Nhập a21: ");
        double a21 = sc.nextDouble();
        System.out.print("Nhập a22: ");
        double a22 = sc.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = sc.nextDouble();

        // Tính định thức
        double D = a11 * a22 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        // Kiểm tra các trường hợp đặc biệt
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {
            // Tính nghiệm của hệ phương trình
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiệm của hệ phương trình\n" + a11 + "x + " + a12 + "x = " + b1 +
                    "\n" + a21 + "x + " + a22 + "x = " + b2 + "\n" +
                    "x1 = " + x1 + "\n" +
                    "x2 = " + x2);
        }
    }

    // Giải phương trình bậc hai: ax^2 + bx + c = 0
    private static void GiaiPTBacHaiMotAn(Scanner sc) {
        System.out.println("Giải phương trình ax^2 + bx + c = 0");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        // Kiểm tra nếu a = 0
        if (a == 0) {
            System.out.println("Lỗi: 'a' không thể bằng 0.");
        } else {
            // Tính Delta
            double Delta = b * b - 4 * a * c;

            // Kiểm tra và đưa ra kết luận dựa trên giá trị Delta
            if (Delta > 0) {
                // Có hai nghiệm thực
                double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm thực: x1 = " + x1 + ", x2 = " + x2);
            } else if (Delta == 0) {
                // Có một nghiệm kép
                double x = -b / (2 * a);
                System.out.println("Phương trình có một nghiệm kép: x = " + x);
            } else {
                // Không có nghiệm thực
                System.out.println("Phương trình vô nghiệm (không có nghiệm thực).");
            }
        }
    }
}
