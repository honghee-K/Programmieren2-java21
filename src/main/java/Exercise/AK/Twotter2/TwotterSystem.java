package Exercise.AK.Twotter2;

import java.util.*;

public class TwotterSystem {

    Map<User, List<Message>> userList = new HashMap<>();
    List<Message> messageList = new ArrayList<>();


    public void addMessage(User user, Message message){
        if(!userList.containsKey(user)){
            messageList.add(message);
            userList.put(user, messageList);
        } else {
            userList.get(user).add(message);
        }

    }

    public List<Message> getAllMessages(){
        Collection<List<Message>> collection = userList.values();
        return collection.stream()
                .flatMap(m -> m.stream())
                .toList();
    }

    // forEach 사용시
    // public List<Message> getAllMessages(){
    //    List<Message> allMessages = new ArrayList<>();
    //    userMessageMap.values().forEach(allMessages::addAll);
    //    return allMessages;
    //}

    public List<Message> getAllMessagesFromDate(String date){
        Collection<List<Message>> collection = userList.values();
        return collection.stream()
                .flatMap(ml -> ml.stream())
                .filter(m -> m.getCreationDate().equals(date))
                .toList();
    }


    public List<Message> getAllMessagesFromUser(User user) {


        //For-Each with IF
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


        //stream()
        /*return userList.entrySet().stream()
                .filter(entry -> entry.getKey().benutzername.equals(user.benutzername))
                .flatMap(entry -> entry.getValue().stream())
                .toList();*/


        // !!!!!!!!!!!!!!!Was ist genau map()?
        return userList.entrySet().stream()
                .filter(entry -> entry.getKey().benutzername.equals(user.benutzername))
                .map(entry -> entry.getValue())
                .findFirst()
                .orElse(new ArrayList<>());

    }

}
