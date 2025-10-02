package SS25.AK.Twotter;

import java.util.*;

public class TwotterSystem {

    Map<User, List<Message>> userMessageMap = new HashMap<>();

    public void addMessage(User user, Message message) {
        if (!userMessageMap.containsKey(user)) {
            List<Message> messages = new ArrayList<>();
            messages.add(message);
            userMessageMap.put(user, messages);
        } else {
            userMessageMap.get(user).add(message);
        }
    }

    /*    public List<Message> getAllMessages(){
        Collection<List<Message>> messageList = userMessageMap.values();
        List<Message> allMessages = new ArrayList<>();
        for(List<Message> messages : messageList){
            allMessages.addAll(messages);
        }
        return allMessages;
    }*/

    public List<Message> getAllMessages2() {
        Collection<List<Message>> messageList = userMessageMap.values();
        return messageList.stream().flatMap(L -> L.stream()).toList();
    }

    //das ist falsch, oder? wenn es die user im Map nicht gibt ? ChatGpt sagte, dass man equals(), hashCode() im Klass User überschreiben muss..
    public List<Message> getAllMessagesFromUser(User user) {
        return userMessageMap.get(user);
    }

    public List<Message> getAllMessagesFromDate(String date) {
        List<Message> messages = getAllMessages2();
        List<Message> allMessagesFromDate = new ArrayList<>();
        for (Message message : messages) {
            if (message.getCreationDate().equals(date)) {
                allMessagesFromDate.add(message);
            }
        }
        return allMessagesFromDate;
    }
}
