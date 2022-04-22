//Bài 7. Nhập vào một số có nhiều chữ số, đảo ngược chữ số vừa nhập. Vd: nhập 1234 -> in ra màn hình 4321

package buoi2;

import java.util.Scanner;

public class Bai7 {
    //sử dụng class Scanner để lấy dữ liệu từ bàn phím
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
// Khai báo biến num1 là số cần đảo ngược, reversed là số sau khi đảo ngược
        int num1, num2, reversed = 0;
        System.out.println("Nhap vao so can dao nguoc: ");
        num1 = sc.nextInt();
// Gán num1 cho num2 chỉ để hiển thị ra màn hình
        num2 = num1;
// Sử dụng vòng lặp while để đảo ngược num1
        while (num1 != 0){
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }
/**
// Sử dụng vòng lặp for để đảo ngược num1
        for(num1 != 0; num1 /= 10) {
            int digit = num1 % 10;
           reversed = reversed * 10 + digit;
        }
*/

// Hiển thị số sau khi đảo ngược ra màn hình
        System.out.printf("So %d sau khi dao nguoc la: %d", num2, reversed);
    }
}
/**
 * Giải thích vòng lặp while
 -Giả sử ta có reversed = 0 và num1 = 1234 là số cần đảo ngược

 B1: Thực hiện vòng lặp lần 1: num1 = 1234, reversed = 0
    + Kiểm tra điều kiện vòng lặp num1 != 0, nên ta sẽ thực hiện các câu lệnh bên trong vòng lặp
        1. digit = num1 % 10 = 1234 % 10 = 4 ==> digit = 4
        2. reversed = reversed * 10 + digit = 0 * 10 + 4 = 4 ==> reversed = 4
        3. num1 = num1 / 10 = 1234 / 10 = 123 ==> num1 = 123
    + Kết thúc vòng lặp lần 1 có: reversed = 4, num1 = 123
 ( Biến digit chỉ là biến trung gian vậy nên ta ko quan tâm đến nó )

 B2: Thực hiện vòng lặp lần 2: num1 = 123, reversed = 4
    + Tương tự như vòng lặp 1, sau khi kết thúc vòng lặp lần 2 ta đc:
           ==> num1 = 12, reversed = 43

 B3: Thực hiện vòng lặp lần 3: num1 = 12, reversed = 43
    + Sau khi kết thúc ta được:
            ==> num1 = 1, reversed = 432

 B4: Thực hiện vòng lặp lần 4: num1 = 1, reversed = 432
    + Kết thúc vòng lặp ta được:
            ==> num1 = 0, reversed = 4321

 Vậy, num1 = 0 ko thỏa mãn điều kiện vòng lặp while nên kết thúc vòng lặp
 Ta được kết quả: reversed = 4321 là số đảo ngược của num1 = 1234
 */