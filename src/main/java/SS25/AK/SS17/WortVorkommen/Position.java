package SS25.AK.SS17.WortVorkommen;

public final class Position implements Comparable<Position> {
    int zeilennummer , spaltennummer ;

    public Position(int zeilennummer, int spaltennummer){
        this.zeilennummer = zeilennummer;
        this.spaltennummer = spaltennummer;
    }
    @Override
    public int compareTo(Position o) {
        if(this.zeilennummer != o.zeilennummer) {
            return Integer.compare(this.zeilennummer, o.zeilennummer);
        } else {
            return Integer.compare(this.spaltennummer, o.spaltennummer);
        }
    }
}
