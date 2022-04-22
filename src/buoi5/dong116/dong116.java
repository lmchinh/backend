package buoi5.dong116;

import java.util.Scanner;

public class dong116 {
        public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Nhap so bat ki tu ban phim");
            int number = sc.nextInt();

            // String format below will add leading zeros (the %0 syntax)
            // đếm số trên
            // Độ dài cảu chuỗi sẽ là 10 kí tự

            String formatted = String.format("%010d", number);

            System.out.println("Số với số 0 hàng đầu: " + formatted);
        }
    }
