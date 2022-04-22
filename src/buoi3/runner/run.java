package buoi3.runner;

public class run {
    public static void main(String[] args) {
        Person per = new Person("LMC", "sv");
        per.learn();
        per.walk();
        per.eat();

        Programmer pro = new Programmer("LMC", "sv", "T3h");
        pro.learn();
        pro.walk();
        pro.eat();
        pro.coding();

        Dancer dan = new Dancer("LMC", "sv", "java");
        dan.learn();
        dan.walk();
        dan.eat();
        dan.dancing();

        Singer sin =  new Singer("LMC", "sv", "cntt");
        sin.learn();
        sin.walk();
        sin.eat();
        sin.singing();
        sin.playGitar();

    }

}
