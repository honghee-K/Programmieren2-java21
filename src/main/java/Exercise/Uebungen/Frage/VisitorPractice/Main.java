    package Exercise.Uebungen.Frage.VisitorPractice;

    import java.util.function.Predicate;

    public class Main {
        public static void main(String[] args){
            CPU cpu = new CPU(200.0);
            RAM ram = new RAM(150.0);
            Computer computer = new Computer();
            computer.addPart(cpu);
            computer.addPart(ram);

            PriceCalculatorVisitor priceCalculatorVisitor = new PriceCalculatorVisitor();
            computer.accept(priceCalculatorVisitor);
        }
    }
