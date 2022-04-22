package buoi3_2.bai1;

public class time {
    private int hour;
    private int minute;
    private int second;

    //    Tạo contructor
    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //    getter, setter
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
//    public void hienThi() {
//        System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());
//
//    }
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public time nextSecond() {
        return new time(this.hour, this.minute, this.second + 1);
    }

    public time previousSecond() {
        return new time(this.hour, this.minute, this.second - 1);
    }


}
