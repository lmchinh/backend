package buoi4.Truutuong;

public class Ball implements Tossable {
    private String brandName;


    @Override
    public void toss() {

    }

    public Ball(String brandName){
    this.brandName = brandName;
}

    public Ball(String brandName, int azx){
        this.brandName = brandName;
    }
    public String getBrandName() {
        return brandName;
    }

    public void bounce(){
        System.out.println("bounce");

    }
}





