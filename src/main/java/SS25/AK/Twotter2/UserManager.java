package SS25.AK.Twotter2;

import java.io.*;
import java.util.List;

public class UserManager implements ObjectManager2<User> {

    @Override
    public void serialize(List<User> object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"))) {
            oos.writeObject(object);
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"))) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
