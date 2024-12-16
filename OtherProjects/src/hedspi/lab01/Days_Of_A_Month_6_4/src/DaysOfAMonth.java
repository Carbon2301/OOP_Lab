package hedspi.lab01.Days_Of_A_Month_6_4.src;

import java.util.Scanner;

public class DaysOfAMonth {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu người dùng từ bàn phím.
        Scanner sc = new Scanner(System.in);
        System.out.println("Trinh Huu An - 20225593");
        // Khai báo mảng `tenThang` chứa tên đầy đủ của các tháng trong năm từ tháng 1 đến tháng 12.
        String[] tenThang = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        // Khai báo mảng `ngayTrongThang` chứa số ngày tương ứng cho mỗi tháng (dùng cho năm không nhuận).
        int[] ngayTrongThang = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Vòng lặp vô hạn cho phép chương trình kiểm tra tháng và năm liên tục.
        while (true) {
            // Yêu cầu người dùng nhập tháng (có thể là tên, viết tắt hoặc số).
            System.out.println("Nhập tháng (tên đầy đủ, viết tắt, hoặc số): ");
            String thang = sc.nextLine();

            // Yêu cầu người dùng nhập năm.
            System.out.println("Nhập năm (số dương): ");
            int nam = nhapNam(sc); // Gọi hàm `nhapNam` để đảm bảo năm hợp lệ.

            // Tìm chỉ số của tháng trong mảng `tenThang` bằng cách gọi hàm `layChiSoThang`.
            int chiSoThang = layChiSoThang(thang, tenThang);
            if (chiSoThang == -1) { // Kiểm tra nếu tháng không hợp lệ.
                System.out.println("Tháng không hợp lệ! Vui lòng nhập lại.");
                continue; // Yêu cầu người dùng nhập lại.
            }

            // Kiểm tra năm nhuận bằng cách gọi hàm `kiemTraNamNhuan`.
            boolean laNamNhuan = kiemTraNamNhuan(nam);
            // Nếu là tháng 2 và năm nhuận, in ra thông báo có 29 ngày.
            if (chiSoThang == 1 && laNamNhuan) {
                System.out.println("Tháng 2 năm " + nam + " có 29 ngày.");
            } else {
                // In ra số ngày của tháng dựa trên chỉ số trong mảng `ngayTrongThang`.
                System.out.println(tenThang[chiSoThang] + " năm " + nam + " có " + ngayTrongThang[chiSoThang] + " ngày.");
            }

            // Hỏi người dùng có muốn kiểm tra tháng khác hay không.
            System.out.println("Bạn có muốn kiểm tra tháng khác? (1 - có/2 - không): ");
            String tiepTuc = sc.nextLine();
            if (!tiepTuc.equals("1")) break; // Nếu người dùng nhập khác 1, thoát chương trình.
        }

        // Đóng đối tượng Scanner.
        sc.close();
    }

    // Hàm `nhapNam` để nhập năm và kiểm tra định dạng và giá trị của năm.
    private static int nhapNam(Scanner sc) {
        while (true) {
            try { //try catch dung de xu li truong hop ngoai le ma khong thong bao loi
                // Đọc chuỗi từ người dùng và chuyển thành số nguyên.
                int nam = Integer.parseInt(sc.nextLine()); //Nếu đọc sc.nextInt thì đọc cả "\n" => chương trình chạy 1 lần
                if (nam >= 0) return nam; // Nếu năm hợp lệ (không âm), trả về năm.
                else System.out.println("Năm không hợp lệ! Vui lòng nhập lại.");
            } catch (NumberFormatException e) {
                // Bắt ngoại lệ khi nhập không phải số.
                System.out.println("Định dạng năm không hợp lệ! Vui lòng nhập lại.");
            }
        }
    }

    // Hàm `layChiSoThang` tìm chỉ số của tháng trong mảng `tenThang`.
    private static int layChiSoThang(String thang, String[] tenThang) {
        try {
            // Nếu người dùng nhập số, chuyển chuỗi thành số nguyên và tìm tháng.
            int soThang = Integer.parseInt(thang);
            if (soThang >= 1 && soThang <= 12) return soThang - 1; // Trả về chỉ số của tháng.
        } catch (NumberFormatException ignored) {} //Không thực hiện bất cứ gì khi gặp trường hợp trong try

        // So sánh chuỗi người dùng nhập với tên đầy đủ hoặc viết tắt của tháng.
        for (int i = 0; i < tenThang.length; i++) {
            if (tenThang[i].equalsIgnoreCase(thang) || tenThang[i].substring(0, 3).equalsIgnoreCase(thang)) {
                return i; // Trả về chỉ số của tháng nếu khớp.
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy tháng hợp lệ.
    }

    // Hàm `kiemTraNamNhuan` kiểm tra xem năm có phải là năm nhuận hay không.
    private static boolean kiemTraNamNhuan(int nam) {
        // Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100, hoặc chia hết cho 400.
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }
}
