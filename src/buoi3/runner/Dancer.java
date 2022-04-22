package buoi3.runner;

public class Dancer extends Person {
    private String groupName;

    //    Tạo contructor
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    //    setter, getter
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    //    Phương thức
    public void dancing() {
        System.out.println("dancing");
    }
}
