package Exercise.Uebungen.Lek22;

public class SizeVisitor<T> implements Visitor<T> {
    int counter = 0;

    @Override
    public void visit(Baum.Knoten<T> current) {
        counter++;
    }
}
