package Exercise.Uebungen.Lek22;

import Exercise.Uebungen.Lek22.Baum.Knoten;
public interface Visitor<T>
{
    public void visit(Knoten<T> current);
}
