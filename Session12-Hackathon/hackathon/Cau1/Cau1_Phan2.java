package hackathon.Cau1;

import java.util.Scanner;

public class Cau1_Phan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        // Kiểm tra rỗng
        if (s.trim().isEmpty()){
            System.out.println("Lỗi: Không nhập nội dung");
            return;
        }

        boolean doiXung = true;
        int length = s.length();

        // Chỉ dùng 1 vòng lặp
        for (int i = 0; i < length / 2; i++){
            if (s.charAt(i) != s.charAt(length - 1 - i)){
                doiXung = false;
                break;
            }
        }

        if (doiXung){
            System.out.println("Chuoi doi xung");
        } else {
            System.out.println("Chuoi khong doi xung");
        }
    }
}
