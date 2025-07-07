package Exercise.AK.BaumVisitor;

public class Baum<E extends Comparable<E>>
{
    public static class Knoten<E>
    {
        Knoten<E> left;
        Knoten<E> right;
        E content;
    }

    Knoten<E> root;
    public void einfuegen(E content) {
        Knoten<E> neu = new Knoten<>();
        neu.content = content;

        if (root == null) {
            root = neu;
            return;
        }

        Knoten<E> current = root;
        Knoten<E> parent = null;

        while (current != null) {
            parent = current;
            int cmp = content.compareTo(current.content);
            if (cmp < 0) {
                current = current.left;
            } else if (cmp > 0) {
                current = current.right;
            } else {
                // 중복 값 처리 (필요하면)
                return;
            }
        }

        int cmp = content.compareTo(parent.content);
        if (cmp < 0) {
            parent.left = neu;
        } else {
            parent.right = neu;
        }
    }
    protected void traversiere(Visitor<E> visitor)
    {
        if (root == null) return;
        else traversiere(root, visitor);
    }
    protected void traversiere(Knoten<E> current, Visitor<E> visitor)
    {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }
    public int size(){
        CounterVisitor counterVisitor = new CounterVisitor();
        traversiere(counterVisitor);
        return counterVisitor.getCount();
    }
}