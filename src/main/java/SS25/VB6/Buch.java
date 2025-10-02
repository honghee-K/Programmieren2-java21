package SS25.VB6;

public class Buch implements Comparable<Buch> {

    String titel;
    int seiten;

    public Buch(String titel, int seiten) {
        this.titel = titel;
        this.seiten = seiten;
    }

    @Override
    public int compareTo(Buch o) {
        // 순서 기준이 뭐야?
        int result = Integer.compare(o.seiten, this.seiten); // absteigend
        if (result == 0) {
            result = this.titel.compareTo(o.titel); //aufsteigend
        } //
        return result;

        // return o.seiten == this.seiten ? this.titel.compareTo(o.titel) : o.seiten - this.seiten;
    }

    public static void main(String[] args) {
        System.out.println("Heinzl".compareTo("Zilker"));
    }
}
