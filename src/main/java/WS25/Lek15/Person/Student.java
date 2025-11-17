package WS25.Lek15.Person;

public class Student extends Person {
    String fach;

    public Student(String fach) {
        this.fach = fach;
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Der Student besucht das Fach " + fach);
    }
}
