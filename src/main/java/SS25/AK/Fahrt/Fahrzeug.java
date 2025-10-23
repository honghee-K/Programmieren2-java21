package SS25.AK.Fahrt;

import java.util.ArrayList;
import java.util.List;

// 추상클래스: 이런 속성과 기본행동을 줄게!
// 인터페이스: 이런 기능을 제공할게!(can-do)
public abstract class Fahrzeug {

    List<Fahrt> fahrtenbuch = new ArrayList<>();

    public abstract double berechneEntgelte(Fahrt f);

    public void fahrtenEintragen(Fahrt f) {
        fahrtenbuch.add(f);
        System.out.println("Fahrt wurde eingetragt");
    }

    public List<Fahrt> getFahrtenbuch() {
        return fahrtenbuch;
    }
}
