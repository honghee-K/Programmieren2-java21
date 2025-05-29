package Exercise.Uebungen.Lek22;

public class Baum<E extends Comparable<E>>
{
    public static class Knoten<E>
    {
        Knoten<E> left;
        Knoten<E> right;
        E content;

        Knoten(E content){
            this.content = content;
        }
    }


    Knoten<E> root;
    public void einfuegen(E content) {
        if(content == null){
            throw new IllegalArgumentException("Inhalt darf nicht null sein");
        }
        if(root == null){
            root = new Knoten<>(content);
        } else {
            insertElement(root, new Knoten<>(content));
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

    private void insertElement(Knoten<E> temp, Knoten<E> neu){
//        if (temp == null){
//            throw new IllegalArgumentException("Inhalt darf nicht null sein");
//        }
        if (neu.content.compareTo(temp.content) < 0){
            if(temp.left == null){
                temp.left = neu;
            } else {
                insertElement(temp.left, neu);
            }
        } else {
            if(temp.right == null){
                temp.right = neu;
            } else{
                insertElement(temp.right, neu);
            }
        }
    }

    public int size(){
        SizeVisitor<E> sizeVisitor = new SizeVisitor<>();
        this.traversiere(sizeVisitor);
        return sizeVisitor.counter;
    }
}
