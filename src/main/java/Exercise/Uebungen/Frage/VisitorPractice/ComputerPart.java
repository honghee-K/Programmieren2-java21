package Exercise.Uebungen.Frage.VisitorPractice;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
