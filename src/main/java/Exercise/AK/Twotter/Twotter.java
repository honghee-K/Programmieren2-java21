package Exercise.AK.Twotter;

import java.util.List;

public class Twotter
{
    public static void main(String[] args)
    {
        TwotterSystem system = new TwotterSystem();
        User u = new User("joe", "joeRus!");
        system.addMessage(u,
                new Message("Hello World!"));
        List<Message> a = system.getAllMessages2();

        List<Message> m =
                system.getAllMessagesFromDate(
                        "2019-05-31");
        List<Message> d = haha
                system.getAllMessagesFromUser(u);
    }
}
