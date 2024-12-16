package hedspi.lab01.Matrices_6_6.src;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Trinh Huu An - 20225593");
        // Nhập kích thước của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = sc.nextInt();
        // Khởi tạo hai ma trận
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];
        // Nhập phần tử cho ma trận 1
        System.out.println("Nhập phần tử cho ma trận 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        // Nhập phần tử cho ma trận 2
        System.out.println("Nhập phần tử cho ma trận 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        // Tính tổng của hai ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // Hiển thị kết quả
        System.out.println("Tổng của hai ma trận là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }
        sc.close();
    }
}
