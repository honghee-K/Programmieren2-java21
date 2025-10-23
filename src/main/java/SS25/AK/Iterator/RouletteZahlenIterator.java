package SS25.AK.Iterator;

import java.util.Iterator;
import java.util.Random;

public class RouletteZahlenIterator implements Iterator<Integer> {

    int num;
    int nullcounter;
    Random rd = new Random();

    @Override
    public boolean hasNext() {
        if (nullcounter != 3) {
            return true;
        }
        return false;
    }

    public Integer next() {
        num = rd.nextInt(37);
        if (num == 0) {
            nullcounter++;
        }
        return num;
    }

    public void remove() {
        throw new RuntimeException("remove wird nicht verwendet");
    }
}
