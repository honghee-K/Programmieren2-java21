package WS25.lek15.Person;

public class Professor extends Person {
    String fach;

    public Professor(String fach) {
        this.fach = fach;
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Der Professor unterricht " + fach);
    }
}
