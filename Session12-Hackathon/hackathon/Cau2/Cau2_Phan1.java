package hackathon.Cau2;

import java.util.Scanner;

public class Cau2_Phan1 {
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

        boolean doiXung = true;

        // Chỉ 1 vòng lặp kiểm tra
        for (int i = 0; i < n / 2; i++){
            if (a[i] != a[n - 1 - i]){
                doiXung = false;
                break;
            }
        }

        if (doiXung){
            System.out.println("Mảng đối xứng");
        } else {
            System.out.println("Mảng không đối xứng");
        }
    }
}
