package Exercise.Uebungen.Frage.VisitorPractice;

public class CPU implements ComputerPart {
    private double price;

    public CPU(double price) { this.price = price; }
    public double getPrice() { return price; }
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
