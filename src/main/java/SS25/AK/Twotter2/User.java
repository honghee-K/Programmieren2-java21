package SS25.AK.Twotter2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    final String benutzername;
    String passwort;

    int alt;
    List<Message> messageList = new ArrayList<>();

    public User(String benutzername, String passwort) {
        this.benutzername = benutzername;
        this.passwort = passwort;
    }
}
