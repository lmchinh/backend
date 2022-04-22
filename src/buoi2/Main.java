package buoi2;


import java.util.Scanner;

/**
 I) Biến, Hằng, cách đặt tên biến
    1) Biến
        - Biến có thể đặt tên với dấu (_), ($), a-z
        - Cấu trúc: <kiểu dữ liệu> <tên biến>
    2) Kiểu dữ liệu
        - byte: 1 byte
        - short: 2 byte
        - int: 4 byte
        - char 2 byte _ chứa kiểu dữ liệu là các ký tự trong bảng mã ascii
        - long: 8 byte
        - float: 4 byte
        - doable: 8 byte
        - boolean: 1 bit

        + 1 bit: 0 hoặc 1
        + 1 byte => 8 bit
    3) Biến
        - 1 biến sẽ có giá trị không thể thay đổi   (final)
        - Thêm từ khóa 'final' vào trước kiểu dữ liệu của biến để tại ra 1 hằng số
    4) Esp kiểu dữ kiệu
        - là việc chuyển đổi linh hoạt giá trị của các biểu thức dữ liệu
        => nếu ép kiểu từ kiểu dữ liệu lớn hơn -> nhỏ hơn => gây ra mất mát dữ liệu
        => ép kiểu từ kiểu dữ liệu nhỏ => không gây mất mát dữ liệu

 II) Các biểu thức tính toán trong Java
    1) Các biểu thức
        (+): Cộng
        (-): trừ
        (*): nhân
        (/): chia
        (%): chia lấy dư
    2) Toán tử gán giá trị
        - cách 1: sử dụng dấu (=) để gán gtri cho 1 biến
        - cách 2: sử dụng các toán tử đặt ở phí trước dấu (=), ví dụ: +=, -=, *=, /=
    3) Toán tử tăng giảm
        - (++x): tăng 1 giá trị cho biến x trước tiên khi chạy dòng lệnh
        - (x++): tăng 1 giá trị cho biến x sau khi đi qua dòng lệnh
        - (--x): giảm 1 giá trị trước khi chạy dòng lệnh
        - (x--): giảm 1 gias trị sau khi chạy dòng lệnh

 III) Mệnh đề và các toán tử
        - (&&): bt1 && bt2 => nếu bt1 = false => không kiểm tra tới bt2
        - (&): bt1 & bt2 => nếu bt1 = false => vẫn check tới bt2
        - (||): bt1 || bt2 => nếu bt1 = true => không check tới bt2
        - (|): bt1 | bt2 => nếu bt1 = true => vẫn check tới bt2

 IV) if else
        - if (Biểu_thức_logic) {
                Các_câu_lệnh_ứng_BT_đúng;
             }else {
                Các_câu_lệnh_ứng_BT_sai;
             }
        - switch (bt_switch) {
            case gtri1: lenh(s)1;
             break;
             case gtri2: lenh(s)2;
             break;
             ……
             case gtriN: lenh(s)N;
             break;
            default: lenh(s)-khi-default;
             }

 V) Các lệnh vòng lặp
 - while
            + (đk_tiếp_tục_lặp) {
                 // thân_vòng_lặp;  các_câu_lệnh;
                 }

 - do-while
             + do {
                 // thân_vòng_lặp;
                 các_câu_lệnh;
             } while (đk_tiếp_tục_lặp);

 - for
            + for (khởi_tạo; đk_tiếp_tục_lặp; cviệc_sau_mỗi_lần_lặp)
                 {
                 // thân vòng lặp;  các_câu_lệnh;
                 }


 */
public class Main {
    public static void main(String[] agrs){

//        int a = 10;
//        int b = 20;
//        int tongAB = a + b;
//        System.out.println(tongAB);
//
//        final int tongAB = a + b;
//        final boolean test = true;
//
//        float test2 = 3.5f;
//        int test3 = (int) test2;
//        System.out.println("test2: " + test2);
//        System.out.println("test3: " + test3);


//        int a = 0;
//        int b = 4;
//        int tong = ++a + b;
//        System.out.println("tong1: " + tong);
//        System.out.println("tong2: " + tong++);

//        boolean a =  1 > 2;
//        System.out.println(a + "");

       // Một năm là năm nhuận nếu nó chia hết cho 4, nhưng không chia hết cho  100 hoặc nó chia hết cho 400. Source code xác định năm nhuận như sau:

//        int nam = 2020;
//        boolean laNamNhuan = (nam % 4 == 0) && ((nam % 100 != 0) || (nam % 400 == 0));
//        System.out.println(laNamNhuan + "");

//        int x = 1;
//        boolean test = (x > 1) & (x++ < 10);
//        System.out.println("x: " + x);
//        System.out.println("test: " + test);

//        int bankinh = 9;
//        float dientich = 0;
//        if (bankinh >= 0) {
//            dientich = bankinh * bankinh * 3.14f;
//
//            System.out.println("Dien tich hinh tron co ban kinh " + bankinh + " la  " + dientich);
//
//        }else {
//            System.out.println("Du lieu khong hop le!");
//        }


//        int sonam = 6;
//        float laisuatnam = 0;
//        switch (sonam) {
//            case 6:
//                laisuatnam = 7.25F;
//                break;
//            case 15:
//                laisuatnam = 8.50F;
//                break;
//            case 30:
//                laisuatnam = 9.0F;
//                break;
//            default:
//                System.out.println("Sai so nam, nhap 7, 15, hoac 30");
//        }
//        System.out.println("lai xuat la: " + laisuatnam);

//        // Cấu trúc lệnh while
//        int a = 10;
//        while (a > 1){
//            System.out.println("a = " + a);
//            a--;
//        }
//
//        // Cau truc lenh do-while
//        int b = 10;
//        do{
//            System.out.println("b: " + b);
//            b--;
//        }while (b > 0);
//
//        // for
//        for(int i = 0; i <= 100; i--){
//            System.out.println((" i love you "));
//        }

        // nhap vao cac chức năng muốn thực hiện
        /**
         Nhập vào các chức năng muốn thực hiện
         1: xin chào
         2: chúc ngủ ngon
         3: chào buổi sáng
         4: kết thúc ctrinh
         */
        int input;
        boolean isContinue = true;
        System.out.println("xin chao da den voi he thong");
        do{
            System.out.println("moi nhap chuc nang ban muon");
            System.out.println("1: xin chào");
            System.out.println("2: chúc ngủ ngon");
            System.out.println("3: chào buổi sáng");
            System.out.println("4: kết thúc ctrinh");
            input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    System.out.println("xin chao");
                    break;
                case 2:
                    System.out.println("chuc ngu ngon");
                    break;
                case 3:
                    System.out.println("chao buoi sang");
                    break;
                default:
                    isContinue = false;
            }
        }while (isContinue);



        }
}
