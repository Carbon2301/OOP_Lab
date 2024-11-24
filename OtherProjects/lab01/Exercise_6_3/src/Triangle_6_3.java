import java.util.Scanner;

public class Triangle_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai tam giac(AnTH - 20225593): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // In khoang trang de can giua tam giac
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In cac dau *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Xuong dong sau khi in xong 1 hang
            System.out.println();
        }

        sc.close();
    }
}
