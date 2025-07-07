package Exercise.Uebungen.Frage.VisitorPractice;

public class PriceCalculatorVisitor implements ComputerPartVisitor{

    public void visit(CPU cpu){
        System.out.println("Price for CPU: " + cpu.getPrice());
    }
    public void visit(RAM ram){
        System.out.println("Price for CPU: " + ram.getPrice());

    }
    public void visit(Computer computer){
        System.out.println("Visiting computer");
    }
}
