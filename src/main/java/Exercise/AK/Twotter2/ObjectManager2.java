package Exercise.AK.Twotter2;

import java.util.List;

public interface ObjectManager2<T>{
    public void serialize(List<T> object);
    public List<T> deserialize();
}
