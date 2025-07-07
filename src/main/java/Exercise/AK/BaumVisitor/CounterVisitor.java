package Exercise.AK.BaumVisitor;
import Exercise.AK.BaumVisitor.Baum.Knoten;


public class CounterVisitor<T> implements Visitor<T> {
    private int count = 0;

    @Override
    public void visit(Knoten<T> current) {
        count++;
    }
    public int getCount(){
        return count;
    }
}
