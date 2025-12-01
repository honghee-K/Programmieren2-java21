package WS25.Tutorium.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class GenericImpl<T> {
    //public Optional<T> findFirst(Collection<T> collection, Predicate<T> predicate){ 로 쓰려면 클래스에 <T> 필요
    public static <T> Optional<T> findFirst(Collection<T> collection, Predicate<T> predicate){ // erste <T> : <T extends Comparable<T>
        collection = new ArrayList<T>();
        for(T t : collection){
            if(predicate.test(t)){
                return Optional.of(t);
            }
        }

            return Optional.empty();
        //collection.stream().filter(predicate).findFirst();
    }



    public static void main(String[] args){
        GenericImpl<Integer> impl = new GenericImpl();
       // impl.findFirst();
    }
}
