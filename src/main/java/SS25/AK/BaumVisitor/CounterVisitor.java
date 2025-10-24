package SS25.AK.BaumVisitor;

import SS25.AK.BaumVisitor.Baum.Knoten;

public class CounterVisitor<T> implements Visitor<T> {
    private int count = 0;

    @Override
    public void visit(Knoten<T> current) {
        count++;
    }

    public int getCount() {
        return count;
    }
}
