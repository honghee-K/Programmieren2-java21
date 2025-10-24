package SS25.AK.Twotter2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User("Han", "1234");
        User user2 = new User("Yan", "0000");

        UserManager userManagers = new UserManager();
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user2);

        // Schreiben Sie eine main-Methode und zeigen Sie an einem sinnvollen Beispiel, wie eine Liste
        // von User-Objekten mit Hilfe von UserManager geschrieben werden kann.

        userManagers.serialize(userList);
        List<User> loadedUsers = userManagers.deserialize();
        loadedUsers.stream().forEach(u -> System.out.println(u.benutzername));
    }
}
