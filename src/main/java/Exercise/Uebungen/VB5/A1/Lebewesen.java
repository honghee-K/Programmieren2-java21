package Exercise.Uebungen.VB5.A1;

import java.io.Serializable;

public abstract class Lebewesen implements Serializable {
    String name;

    public Lebewesen(String name) {
        this.name = name;
    }

    public abstract void beschreibe();
}
