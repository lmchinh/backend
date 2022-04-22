package buoi3_2.bai5;

public class runs {
    public static void main(String[] args) {
        Person staff = new Staff("Tran Manh Chung", "HN", "Nam Dinh", 40000000);
        System.out.println(staff.toString());
        Student student = new Student("Le Minh Chinh", "CL", "Java", 1999, 0);
        System.out.println(student.toString());
    }
}
