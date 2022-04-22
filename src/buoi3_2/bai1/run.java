package buoi3_2.bai1;

public class run {
//    static time t = new time(22, 10, 10);
    public static void main(String[] args) {

            System.out.println(new time(1,2,3).toString());
            time timenew = new time(4,5,6);
            System.out.println("Hour: " + timenew.getHour());
            System.out.println("Minute: " + timenew.getMinute());
            System.out.println("Second: " + timenew.getSecond());
            timenew.setTime(23, 59,58);
            System.out.println(timenew.toString());
            System.out.println(timenew.nextSecond().toString());
            timenew.setTime(0,0,0);
            System.out.println(timenew.nextSecond());
            System.out.println(timenew.toString());
            timenew.setTime(23,59,58);
            System.out.println(timenew.toString());

//        t.hienThi();
    }
}
