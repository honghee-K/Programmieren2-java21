package SS25.Uebungen.Frage.VisitorPractice;

public class RAM implements ComputerPart{

    private double preis;

    public RAM(double preis){
        this.preis = preis;
    }
    public double getPrice(){
        return preis;
    }
    @Override
    public void accept(ComputerPartVisitor visitor){
        visitor.visit(this);
    }

}
