package buoi5.bai92;

import java.util.Scanner;

public class bai92 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap noi dung bat ki tu ban phim");
        String input = sc.nextLine();





        int index = input.indexOf(" ");
        System.out.println(input.substring(0, index));

    }

}
