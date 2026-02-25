package hackathon.Cau3;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        if (n <= 0 || n >= 100) {
            System.out.println("Số lượng phần tử không hợp lệ");
            return;
        }

        int[] A = new int[n];

        // Nhập mảng
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Nhập K
        System.out.print("Nhập K: ");
        int K = sc.nextInt();

        boolean found = false;

        // Tìm cặp đầu tiên có tổng = K
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (A[i] + A[j] == K) {
                    System.out.println("Cặp tìm được: " + A[i] + " va " + A[j]);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Không tồn tại cặp nào");
        }
    }
}
