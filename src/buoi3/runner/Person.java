package buoi3.runner;

public class Person {
    public String name;
    public String designtion;

    // Tạo contructor
    public Person(String name, String designation) {
        this.name = name;
        this.designtion = designation;
    }

    //    setter,getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return getName();
    }

    public void setDesigntion(String designtion) {
        this.designtion = designtion;
    }

    public String getDesigntion() {
        return getDesigntion();
    }

    //    Phương thức
    public void learn() {
        System.out.println("learn");
    }

    public void walk() {
        System.out.println("walk");
    }

    public void eat() {
        System.out.println("eat");
    }


}
