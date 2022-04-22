//Bài 2. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.

package buoi2;

import java.util.Scanner;

public class Bai2 {
    /**
     - Để tính tổng các chữ số của một số nguyên dương:
     + Ta sẽ thực hiện phép chia lấy dư số đó cho 10.
     + Sau mỗi lần thực hiện phép chia lấy dư này, chúng ta sẽ cộng các số dư đó
lại và chia tiếp số nguyên dương đó cho 10.
     + Sau đó, quay lại thực hiện các bước vừa rồi,
     + Chương trình sẽ kết thúc khi số đó = 0.
     */
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n, soDu, tong = 0;
        System.out.println("Nhap vao so nguyen bat ky");
        n = sc.nextInt();
        while (n > 0){
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }
        System.out.println("Tong cac chu so = " + tong);
    }
}
