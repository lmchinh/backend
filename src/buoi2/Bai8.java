package buoi2;

import java.util.Scanner;

public class Bai8 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
//        Trong vòng lặp While đầu tiên, chúng ta sẽ đếm các chữ số trong số đầu vào và sau đó trong vòng lặp While thứ hai, chúng ta sẽ trích xuất các chữ số từ chữ số đầu vào bằng toán tử Modun.
        int num, temp, digit, count = 0;
        System.out.print("Nhập vào số cần tách:");
        num = sc.nextInt();
        sc.close();
        temp = num;
        while(num > 0)
        {
            num = num / 10;
            count++;
        }
        while(temp > 0)
        {
            digit = temp % 10;
            System.out.println("Vị trí số "+count+" là: "+digit);
            temp = temp / 10;
            count--;
        }
    }

}
