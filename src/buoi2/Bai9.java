package buoi2;

import java.util.Scanner;

public class Bai9 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao so n: ");
        int n = sc.nextInt();
        System.out.println("Cac so le tu 1 den " + n + " la: ");
        for (int i = 1; i <= n; i++){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}
