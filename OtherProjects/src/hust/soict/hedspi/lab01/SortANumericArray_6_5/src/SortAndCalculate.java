package hust.soict.hedspi.lab01.SortANumericArray_6_5.src;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập kích thước mảng(AnTH - 20225593): ");
        int n = sc.nextInt();
        int[] my_array = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            my_array[i] = sc.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(my_array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(my_array));

        // Tính tổng và trung bình
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += my_array[i];
        }
        double average = (double) sum / n;

        // Hiển thị kết quả
        System.out.println("Tổng các phần tử bằng: " + sum);
        System.out.println("Trung bình cộng bằng: " + average);
        sc.close();
    }
}
