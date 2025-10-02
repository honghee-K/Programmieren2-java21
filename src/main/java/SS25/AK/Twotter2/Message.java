package SS25.AK.Twotter2;

import java.time.LocalDate;

public class Message {
    private final String text;
    private final String creationDate;

    public Message(String text) {
        if(text.length() > 140){
            throw new IllegalArgumentException("Message darf maximal 140 Zeichen erhalten");
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
