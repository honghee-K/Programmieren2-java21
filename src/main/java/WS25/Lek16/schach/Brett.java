package WS25.Lek16.schach;

public class Brett {
    boolean[][] brett = new boolean[8][8];

    public Brett() {}

    public void markiereFeld(int x, int y) {
        brett[x - 1][y - 1] = true;
    } // Array inx ab 0

    public boolean gibFeld(int x, int y) {
        return brett[x - 1][y - 1];
    }

    // Auf dem neuen Brett sollen alle Felder markiert sein, die auf einem der beiden "oder" beiden Brettern markiert
    // waren. // Turm + Laeufer = Dame
    public Brett kombiniere(Brett uebergebenesBrett) {
        Brett neuesBrett = new Brett();
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                neuesBrett.brett[i][j] = brett[i][j] || uebergebenesBrett.brett[i][j];
            }
        }
        return neuesBrett;
    }
}
