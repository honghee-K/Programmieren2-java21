package Exercise.Uebungen.Frage.VisitorPractice;

public interface ComputerPartVisitor {
    void visit(CPU cpu);
    void visit(RAM ram);
    void visit(Computer computer);
}
