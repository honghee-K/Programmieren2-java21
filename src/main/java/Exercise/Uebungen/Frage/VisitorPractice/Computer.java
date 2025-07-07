package Exercise.Uebungen.Frage.VisitorPractice;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {
    private List<ComputerPart> parts = new ArrayList<>();

    public void addPart(ComputerPart part) {
        parts.add(part);
    }

    public List<ComputerPart> getParts() {
        return parts;
    }

    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
    }
}
