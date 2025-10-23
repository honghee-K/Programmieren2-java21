package WiederholungProgI;

public class SudokuChecker {

    public int[][] sudoku;

    public SudokuChecker(int[][] sudoku) {
        if (sudoku.length != 9) {
            throw new RuntimeException("Ein quadratisches Rätsel darf mit Seitenlänge 9 sein.");
        }
        for (int[] zeile : sudoku) {
            if (zeile.length != 9) {
                throw new RuntimeException("Jede Zeile des Rätsels muss 9 Elemente enthalten.");
            }
        }
        this.sudoku = sudoku;
    }

    public boolean ueberpruefeGebiet(int[][] gebiet) {
        boolean[] vorhanden = new boolean[9];
        for (int[] zeile : gebiet) {
            for (int zahl : zeile) {
                if (zahl < 1 || zahl > 9) {
                    return false;
                }
                if (vorhanden[zahl - 1]) {
                    return false;
                }
                vorhanden[zahl - 1] = true;
            }
        }
        return false;
    }
}
