package buoi3_2.bai3;

public class Author {
    private String name;
    private String email;
    private char gender;

//    contructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

//    getter, setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    //    method
    public String toString() {
        return String.format("Author[name=%s, email=%s, gender=%s]", this.name, this.email, this.gender);
    }


}
