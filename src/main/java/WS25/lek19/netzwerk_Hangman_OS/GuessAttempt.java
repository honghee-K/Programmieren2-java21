package WS25.lek19.netzwerk_Hangman_OS;

import java.io.Serializable;

public class GuessAttempt implements Serializable {
    public String eingabe;
    public GuessAttempt(String eingabe){
        this.eingabe = eingabe;
    }
}
