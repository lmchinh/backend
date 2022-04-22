package buoi2;

import java.util.Scanner;

public class Bai6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        int n = sc.nextInt();
        System.out.println(n + " số đầu tiên của dãy số fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    /**
     * Tính số fibonacci thứ n
     *
     * @param n: chỉ số của số fibonacci tính từ 0
     *           vd: F0 = 0, F1 = 1, F2 = 1, F3 = 2
     * @return số fibonacci thứ n
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
