package SS25.AK.BaumVisitor;

import SS25.AK.BaumVisitor.Baum.Knoten;

public interface Visitor<T> {
    public void visit(Knoten<T> current);
}
