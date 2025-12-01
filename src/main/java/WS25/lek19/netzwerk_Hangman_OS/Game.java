package WS25.lek19.netzwerk_Hangman_OS;

public interface Game {

    String welcome();
    boolean isRunning();
    String processUserInput(String eingabe);
}
