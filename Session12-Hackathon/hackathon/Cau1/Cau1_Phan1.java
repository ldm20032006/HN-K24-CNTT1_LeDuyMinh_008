package hackathon.Cau1;

import java.util.Scanner;

public class Cau1_Phan1 {
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

        int soChuCai = 0;
        int soChuSo = 0;
        int kyTuDacBiet = 0;

        // Duyệt từng ký tự trong chuỗi
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (Character.isLetter(c)){
                soChuCai++;
            }
            else if (Character.isDigit(c)){
                soChuSo++;
            }
            else if (!Character.isWhitespace(c)){
                kyTuDacBiet++;
            }
        }

        // In kết quả
        System.out.println("Số chữ cái: " + soChuCai);
        System.out.println("Số chữ số: " + soChuSo);
        System.out.println("Ký tự đặc biệt: " + kyTuDacBiet);
    }
}
