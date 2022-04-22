//Bài 1. Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b.

package buoi2;

import java.util.Scanner;

public class Bai1 {
/**
 USCLN của 2 số nguyên a và b là một số k lớn nhất, sao cho a và b đều chia hết cho k.

BSCNN của 2 số nguyên a và b là một số h nhỏ nhất, sao cho h chia hết cho cả a và b.
*/
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so a");
        int a = sc.nextInt();
        System.out.println("Nhap so b");
        int b = sc.nextInt();
        System.out.println("USCLN của " + a + " và " + b + " là: " + USCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b + " là: " + BSCNN(a, b));
    }
//    Phuong thuc tim USCLN
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
//    Phuong thuc tim BSCNN
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}



