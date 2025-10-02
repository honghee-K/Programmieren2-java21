package SS25.AK.WS22_23.A1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten {

    // Wie müsste man den Code verändern, damit die generische Methode auch Objekte verarbeiten könnte?
    // public <T> List<T> flatten(List<List<T>> input) ??????? 이게 제네릭타입인거야?
    public List<String> flatten(List<List<String>> input) {

        List<String> result = new ArrayList<>();
//        for(List<String> innerlist : input){
//            for(String list : innerlist){
//                result.add(list);
//            }
//        }
        return input.stream()
                .flatMap(innerlist -> innerlist.stream())
                .collect(Collectors.toList());
        //return result;

    }

    public static void main(String[] args) {
        Flatten flatten = new Flatten();

        List<List<String>> input = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D", "E"),
                Arrays.asList("F")
        );
        System.out.println(flatten.flatten(input));
    }
}
