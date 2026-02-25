package hackathon.Cau2;

import java.util.Scanner;

public class Cau2_Phan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        if (n <= 0 || n >= 100){
            System.out.println("Số lượng phần tử không hợp lệ");
            return;
        }

        int[] a = new int[n];

        // Nhập mảng
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int maxCount = 0;
        int valueMax = a[0];

        // Tìm phần tử xuất hiện nhiều nhất
        for (int i = 0; i < n; i++){
            int count = 0;

            for (int j = 0; j < n; j++){
                if (a[i] == a[j]){
                    count++;
                }
            }

            if (count > maxCount){
                maxCount = count;
                valueMax = a[i];
            }
        }

        System.out.println("Phần tử xuất hiện nhiều nhất: " + valueMax);
        System.out.println("Số lần xuất hiện: " + maxCount);
    }
}
