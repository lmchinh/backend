package buoi5.bai105;

import java.util.Scanner;

public class bai105 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str = "i have a male cat. the color of male cat is Black";
        int c = str.split("male cat").length - 1;
        System.out.println(c);


//        System.out.println("Nhap noi dung bat ki tu ban phim");
//        String input = sc.nextLine();
//
//        int i = input.split(" ").length - 1;
//        System.out.println(+  + " da xay ra " + i + " lan trong " + input);
    }
}
