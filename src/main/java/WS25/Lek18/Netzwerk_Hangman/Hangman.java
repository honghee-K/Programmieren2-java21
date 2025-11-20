package WS25.Lek18.Netzwerk_Hangman;

public class Hangman implements Game{
    private static final String[] WOERTER = {"PYTHON", "JAVA", "TYPESCRIPT", "SQL"};
    private int max = 10;

    private String zielWort;
    private int versuche;
    private boolean[] gerateneBuchstaben = new boolean[26];

    public Hangman() {
        this.zielWort = WOERTER[(int) (Math.random() * WOERTER.length)];
        this.versuche = max;
    }

    public String getZielWort() {
        return zielWort;
    }

    public int getVersuche() {
        return versuche;
    }

    public boolean isGameOver(){
        return versuche <= 0;
    }

    public boolean allesErraten(){
        return !zeigWort().contains("_");
    }

    public String zeigWort(){
        String visible = "";
        for(char c : zielWort.toCharArray()){
            if(gerateneBuchstaben[c - 'A']){
                visible += c;
            } else {
                visible += '_';
            }
        } return visible;
    }

    public String rateWort(String eingabe) {
        if (eingabe == null || eingabe.isEmpty()) {
            return "Leere Eingabe. Versuchen Sie es erneut.";
        }

        eingabe = eingabe.trim().toUpperCase();

        if (eingabe.length() > 1) {
            if (eingabe.equals(zielWort)) {
                return "Korrekt! Sie haben das Wort erraten.";
            } else {
                this.versuche--;
                return "Falsches Wort! Sie haben noch " + versuche + " Versuche.";
            }
        } else {
            char c = eingabe.charAt(0);
            int idx = c - 'A';

            if(!Character.isLetter(c)){
                return "Ungültige Eingabe. Bitte geben Sie einen Buchstaben ein.";
            }

            if(zielWort.contains(String.valueOf(c))){
                gerateneBuchstaben[idx] = true;
                return  "Korrekt! " + c + " ist im Wort.";
            } else {
                versuche--;
                return "Falsch! " + c + " ist nicht im Wort. Sie haben noch " + versuche + " Versuche.";
            }
        }

    }

    @Override
    public String welcome() {
         return "Willkommen! Das Wort hat " + this.zielWort.length() + " Buchstaben.";
    }

    @Override
    public boolean isRunning() {
        return !isGameOver();
    }

    @Override
    public String processUserInput(String eingabe) {
        return rateWort(eingabe);
    }
}
