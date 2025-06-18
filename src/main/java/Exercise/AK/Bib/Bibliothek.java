package Exercise.AK.Bib;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bibliothek {

    List<Buch> bibList = new ArrayList<>();

    public void hinzufuegeBuecher(List<Buch> neuBuecher) {
        bibList.addAll(neuBuecher);
    }

    public void sortiereNachAutorDannNachName() {
        bibList.sort(new BuchComparator());
    }

    public List<Buch> getBibList() {
        return bibList;
    }

    public List<Buch> sucheAutor(String gesuchterAutor) {
        return bibList.stream()
                .filter(str -> str.getAutor().equals(gesuchterAutor))
                .collect(Collectors.toList()); // List 형태로 돌려줄때
    }
}
