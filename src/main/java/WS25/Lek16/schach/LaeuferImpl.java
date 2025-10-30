package WS25.Lek16.schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    int[][] richtungen = {{1,1}, {1,-1}, {-1,1}, {-1,-1}};
    for(int[] richtung : richtungen){
      int x = this.getX();
      int y = this.getY();

      //TODO: Erg�nzen Sie den Algorithmus zur Bestimmung der Felder

    }

    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
  }
}
