package buoi5.bai2;

import java.util.Scanner;

public class google {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhap vao 1 chuoi ki tu: ");
        String input = sc.next();
        System.out.println("Ky tu can dem so lan xuat hien: ");
        char ch = input.charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (ch == input.charAt(i)) count++;
        }
        System.out.println("So lan xuat hien " + ch + ": " + count);
    }
}
