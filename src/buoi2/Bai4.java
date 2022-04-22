//Bài 4. Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.

package buoi2;

import java.util.Scanner;

public class Bai4 {
    /**
    Số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó.
     Ví dụ: 2, 3, 5, 7, 11, 13, 17, … là những số nguyên tố.

     Chú ý: Số 0 và 1 không phải là số nguyên tố.
            Chỉ có số 2 là số nguyên tố chẵn,
            Tất cả các số chẵn khác không phải là số nguyên tố vì chúng chia hết cho 2.
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
