package WS25.lek16.schach;

// Queen: Dame, Rook: Turm, Bishop: Läufe, Knight: Springer, Pawn: Bauer

public class LaeuferImpl extends AbstractFigur implements Laeufer {
    public LaeuferImpl(int x, int y) {
        super(x, y);
    }

    public Brett gibErlaubteFelder() {
        Brett brett = new Brett();
        int[][] richtungen = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        int newX = x;
        int newY = y;

        for (int[] richtung : richtungen) {
            while (true) {
                newX += richtung[0];
                newY += richtung[1];
                if (newX < 1 || newX > 8 || newY < 1 || newY > 8) break;
                brett.markiereFeld(newX, newY);
            }
        }

        return brett;
    }

    public static void main(String[] args) {
        LaeuferImpl l = new LaeuferImpl(4, 5);
        Brett brett = l.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++) {
            for (int i = 1; i <= 8; i++) {
                if (brett.gibFeld(i, j)) System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
    }
}
