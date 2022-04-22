package buoi2;

import java.util.Scanner;

public class Bai10 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int hight;
        System.out.println("Nhap vao chieu cao cua tam giac");
        hight = sc.nextInt();
//        Vòng lặp đầu tiên cho lặp từ 1 đến chiều cao của tam giác, với chức năng là in xuống dòng các ký tự *
        for (int i = 1; i <= hight; ++i){
//            Vòng lặp thứ hai lặp từ 1 đến i, với chức năng là in các ký tự * kèm theo khoảng trắng
            for (int j = 1; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
