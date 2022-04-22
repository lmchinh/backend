package buoi5.bai57;

import java.util.Scanner;

public class bai57 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap noi dung bat ki tu ban phim");
        String input = sc.nextLine();

//        sử dụng phương thức replaceAll() để xóa khoảng trắng
         input = input.replaceAll(" ", "");
        System.out.println("Chuoi sau khi xoa khoang trang: " + input);
    }
}
