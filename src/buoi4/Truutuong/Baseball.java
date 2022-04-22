package buoi4.Truutuong;

public class Baseball extends Ball {

    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void bounce() {
        super.bounce();
        System.out.println("Baseball bounce");
    }

    public void bounce(double c){
//        System.out.println("abc");
    }

    @Override
    public void toss() {
        super.toss();
    }
}