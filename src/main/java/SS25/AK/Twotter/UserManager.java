package SS25.AK.Twotter;

import java.io.*;
import java.util.List;

public class UserManager implements ObjectManager<User> {

    @Override
    public void serialize(List<User> object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"))) {
            oos.writeObject(object);
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException("Serialization Error", e);
        }
    }

    @Override
    public List<User> deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"))) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Deserialization Error", e);
        }
    }
}
