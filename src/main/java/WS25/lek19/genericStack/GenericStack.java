package WS25.lek19.genericStack;

import java.util.ArrayList;

public class GenericStack<T> implements Stack<T> {
    private ArrayList<T> arrList = new ArrayList<>();

    @Override
    public void push(T item) {
        arrList.add(item);
    }

    @Override
    public T pop() {
        if (arrList.isEmpty()) {
            return null;
        }
        return arrList.remove(arrList.size() - 1); // remove() 메서드는 void가 아니라 삭제한 요소를 반환
    }
}

