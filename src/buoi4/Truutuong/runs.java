package buoi4.Truutuong;

public class runs extends Ball {
    public runs(String brandName) {
        super(brandName);
    }

    public static void main(String[] args) {
//        khoi tao
        Ball b = new Ball("jh");

        Tossable tossre = new Ball("abc");

        Ball bbb = new Baseball("B");

        Baseball bb = new Baseball("ball");
        bb.bounce();
        System.out.println(bb);

//        new Ball("h",9);

        bbb.bounce();
        System.out.println(bbb);

//        System.out.printf("Baseball: " + b.getBrandName());
    }
}
