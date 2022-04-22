package buoi2;

import java.util.Scanner;

public class Bai11 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int hight;
        System.out.println("Nhap chieu cao cua tam giac: ");
        hight = sc.nextInt();
//        Vòng lặp đầu tiên lặp từ 1 đến chiều cau hight của tam giác, với chức năng in xuống dòng các số
        for (int i = 1; i <= hight; ++i){
//            Vòng lặp for thứ hai lặp từ 1 đến i, với chức năng in ra các số kèm theo khoảng trắng
            for (int j = 1; j <= i; ++j){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
