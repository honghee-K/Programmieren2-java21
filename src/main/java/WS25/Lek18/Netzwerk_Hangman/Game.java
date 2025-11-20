package WS25.Lek18.Netzwerk_Hangman;

public interface Game {

    String welcome();
    boolean isRunning();
    String processUserInput(String eingabe);
}
