package WS25.lek18.netzwerk_Hangman;

public interface Game {

    String welcome();
    boolean isRunning();
    String processUserInput(String eingabe);
}
