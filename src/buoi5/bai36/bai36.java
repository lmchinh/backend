package buoi5.bai36;

import java.text.NumberFormat;
import java.util.Scanner;

public class bai36 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so tu ban phim");
        double input = sc.nextDouble();
//Để định dạng 1 số ở dạng phần trăm, chúng ta sẽ sử dụng phương thức getPercentageInstance()
        NumberFormat num = NumberFormat.getPercentInstance();
        String percentageEN = num.format(input);
        System.out.println("So " + input + " o dang phan tram = " + percentageEN);
    }
}
