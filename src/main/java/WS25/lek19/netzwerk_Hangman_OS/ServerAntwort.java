package WS25.lek19.netzwerk_Hangman_OS;

import java.io.Serializable;

public class ServerAntwort implements Serializable {
    public String anzuzeigenderString;
    public boolean istErraten;
    public boolean istBeendet;
    public boolean istTreffer;

    public ServerAntwort(String anzuzeigenderString, boolean istErraten, boolean istBeendet, boolean istTreffer) {
        this.anzuzeigenderString = anzuzeigenderString;
        this.istErraten = istErraten;
        this.istBeendet = istBeendet;
        this.istTreffer = istTreffer;
    }


}
