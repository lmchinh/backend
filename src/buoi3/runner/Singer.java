package buoi3.runner;

public class Singer extends Person {
    private String bandName;

    //    Tạo contructoer
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
//    getter, setter

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    //    Phương thức
    public void singing() {
        System.out.println("singing");
    }

    public void playGitar() {
        System.out.println("playGitar");
    }
}
