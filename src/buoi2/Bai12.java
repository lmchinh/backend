package buoi2;

import java.util.Scanner;

public class Bai12 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int hight, k = 0;
        System.out.print("Nhap vao chieu cao cua kim tu thap: ");
        hight = sc.nextInt();
/*  Vòng lặp for đầu tiên lặp từ 1 đến chiều cao hight của kim tự tháp, với chức năng để in xuống dòng các dấu *.
    Trong vòng lặp đầu tiên này sẽ có một vòng lặp for và một vòng lặp while.
*/
         for (int i = 1; i <= hight; ++i, k = 0) {
//  Vòng lặp for thứ hai lặp từ 1 đến chiều cao hight - 1, với chức năng in khoảng trắng.
             for (int j = 1; j <= hight - i; ++j){
                 System.out.print("  ");
             }
//  Vòng lặp while với điều kiện k != 2 * i -1, để in dấu *.
             while (k != 2 * i - 1){
                 System.out.print("* ");
                 ++k;
             }
             System.out.println();
         }

    }
}
