package buoi2;
import java.util.Scanner;

public class BaiTap {

    /**
     Viết chương trình:
        - Nhập vào 2 số a, b
            + nếu b = 0 => xuất ra 1 thông báo lỗi
        - Tính tổng 2 số
        - Lấy phần nguyên khi chia a và b
     */
    public static void main(String[] args) {
        System.out.println("Moi ban nhap a va b");
        //Sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b == 0){
            System.out.println("Lỗi");
        }
        System.out.println("Tổng a và b: " + (a + b));
        System.out.println("Phần nguyên khi chia a và b: " + (a / b));
    }

}
