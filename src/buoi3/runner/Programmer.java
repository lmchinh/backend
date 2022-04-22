package buoi3.runner;

public class Programmer extends Person {
    private String companyName;

    //    Tao contructor
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    //    getter, setter
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    // Phuong thuc
    public void coding() {
        System.out.println("coding");
    }
}
