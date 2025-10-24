package SS25.SS25_Klausur.A1;

// ein zwischen zauberndeHelden oder zauberndeMonster kann implementieren (beide müssen nicht)
public class zauberndeHelden extends Held {
    int magiepunkt;

    public zauberndeHelden(String name, int Trefferpunkt, String rasse, int magiepunkt) {
        super(name, Trefferpunkt, rasse);
        this.magiepunkt = magiepunkt;
    }

    /*   public void sortierung(List<T> list){
        list.sort(() -> { public int compareTo(T t1, T t2){
            return Interger.compare(t1.magiepunkt, t2.magiepunkt);});
    }*/
    // List<Object> list..? compare... nicht compareTo....
}
