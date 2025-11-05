package WS25.Lek16;

import WS25.Lek16.stack.StackVererbung;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    StackVererbung stack = new StackVererbung();
    @Test
    public void test_push(){
        String str = "hong";
        stack.push(str);
        assertEquals("hong", stack.pop());
    }
    @Test
    public void test_pop(){
        String str = "hong";
        stack.push(str);
        assertEquals("hong", stack.pop());
    }

    @Test
    public void test_fehler(){
        assertThrows(RuntimeException.class, () -> stack.pop());
    }
}
