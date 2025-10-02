package SS25.AK.SS17.WortVorkommen;

public final class Wort implements Comparable <Wort> {
    String wort , wortTyp , sprache ;
    int laenge ;

    public Wort(String wort){
        this.wort = wort;
    }

    @Override
    public int compareTo(Wort w){
        return this.wort.compareTo(w.wort);
    }
}
