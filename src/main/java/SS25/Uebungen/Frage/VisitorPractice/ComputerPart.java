package SS25.Uebungen.Frage.VisitorPractice;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
