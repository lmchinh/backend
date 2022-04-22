package buoi5.bai8;

import java.util.Scanner;

public class bai8 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String chuoi;
        int doDai;
        System.out.println("Nhập chuỗi bất kì từ bàn phím");

        chuoi = sc.nextLine();

//        tinh do dai
        doDai = chuoi.length();

        System.out.println("Chuỗi " + chuoi + " có độ dài = " + doDai);
    }
}
