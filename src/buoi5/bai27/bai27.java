package buoi5.bai27;

import java.util.Scanner;

public class bai27 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap noi dung bat ki tu ban phim");
        String input = sc.nextLine();

//        Hàm loại bỏ khoảng trắng thừa
        input = input.trim();
        System.out.println(input);
    }
}
