package buoi5.bai46;

import java.util.Arrays;
import java.util.Scanner;

public class bai46 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap noi dung bat ki tu ban phim");
        String input = sc.nextLine();

//        sử dụng phương thức split() để tách chuỗi
        String[] result = input.split(" ");
        
        System.out.println("Ket qua: " + Arrays.toString(result));
    }
}
