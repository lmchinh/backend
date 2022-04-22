package buoi3;

public class Main {
    public static void main(String[] args) {
        Teacher thor = new Teacher();
        Teacher rambo = new Teacher();
        thor.setAge(23);
        thor.setFullName("NguyenVanA");
        thor.setMajor("T3H");
        System.out.println("teacher a: " + thor.getAge());
        System.out.println("TeacherFullNam: " + thor.getFullName());
        System.out.println(("Major: " + thor.getMajor()));
        PHD name = new PHD();
    }
}

class Teacher {
    private int age;
    private String fullName;
    private String major;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}
class PHD extends Teacher{

}
