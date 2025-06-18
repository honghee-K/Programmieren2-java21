package Exercise.AK.Twotter;

import java.time.LocalDate;

public class Message {
    private final String text;
    private final String creationDate;

    public Message(String text) {
        if (text.length() > 140) {
            throw new IllegalArgumentException("Jede Nachricht darf maximal 140 Zeichen enthalten.");
        }
        this.text = text;
        creationDate = LocalDate.now().toString();
    }

    public String getText() {
        return text;
    }

    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return text;
    }
}
