package SS25.AK.Twotter2;

import java.util.*;

public class TwotterSystem {

    Map<User, List<Message>> userList = new HashMap<>();
    List<Message> messageList = new ArrayList<>();

    public void addMessage(User user, Message message) {
        if (!userList.containsKey(user)) {
            messageList.add(message);
            userList.put(user, messageList);
        } else {
            userList.get(user).add(message);
        }
    }

    public List<Message> getAllMessages() {
        Collection<List<Message>> collection = userList.values();
        return collection.stream().flatMap(m -> m.stream()).toList();
    }

    // forEach 사용시
    // public List<Message> getAllMessages(){
    //    List<Message> allMessages = new ArrayList<>();
    //    userMessageMap.values().forEach(allMessages::addAll);
    //    return allMessages;
    // }

    public List<Message> getAllMessagesFromDate(String date) {
        Collection<List<Message>> collection = userList.values();
        return collection.stream()
                .flatMap(ml -> ml.stream())
                .filter(m -> m.getCreationDate().equals(date))
                .toList();
    }

    public List<Message> getAllMessagesFromUser(User user) {

        // For-Each with IF
        /* Collection<List<Message>> messagesList = userList.values();
        List<Message> allMessages = new ArrayList<>();
        List<Message> allMessagesFromUser = new ArrayList<>();
        for (List<Message> messages : messagesList) {
            allMessages.addAll(messages);
        }
        for(Message message : allMessages){
            if(userList.get(user).equals(user.benutzername)){
                allMessagesFromUser.add(message);
            }
        }
        return allMessagesFromUser;*/

        // stream()
        /*return userList.entrySet().stream()
        .filter(entry -> entry.getKey().benutzername.equals(user.benutzername))
        .flatMap(entry -> entry.getValue().stream())
        .toList();*/

        /* Übungen
        Integer c = 7;
         String b = "" + c;

         List<User> userList1 = new ArrayList<>();
         //userList1.stream().map(u -> u.alt).map(a -> a.toString()).toList();
         Stream<User> stream1 = userList1.stream();
         Stream<Integer> stream2 = stream1.map(u -> u.alt);
         stream2.forEach(i -> {
             if(i > 7){
                 i++;
             } else {
                 i--;
             }
         });*/

        // !!!!!!!!!!!!!!!Was ist genau map()?
        return userList.entrySet().stream()
                .filter(entry -> entry.getKey().benutzername.equals(user.benutzername))
                .map(entry -> entry.getValue())
                .findFirst()
                .orElse(new ArrayList<>());
    }
}
