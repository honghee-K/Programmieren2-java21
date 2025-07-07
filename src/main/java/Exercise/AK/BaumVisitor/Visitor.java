package Exercise.AK.BaumVisitor;

import Exercise.AK.BaumVisitor.Baum.Knoten;

public interface Visitor<T>
{
    public void visit(Knoten<T> current);
}
