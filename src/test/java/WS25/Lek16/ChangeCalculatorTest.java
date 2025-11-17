package WS25.Lek16;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import WS25.Lek16.muenzautomat.ChangeCalculatorImpl;
import org.junit.jupiter.api.Test;

public class ChangeCalculatorTest {

    ChangeCalculatorImpl calc = new ChangeCalculatorImpl();

    @Test
    void test_257Cent() {
        int[] expected = {0, 1, 1, 0, 0, 1, 0, 1};
        int[] actual = calc.getChange(2, 57);
        assertArrayEquals(expected, actual, "Fehler bei 2,57€");
    }

    @Test
    void test_500() {
        int[] expected = {0, 0, 0, 0, 0, 0, 1, 2};
        int[] actual = calc.getChange(5, 0);
        assertArrayEquals(expected, actual, "Fehler bei 5,00€");
    }

    @Test
    void test_18() {
        int[] expected = {1, 1, 1, 1, 0, 0, 0, 0};
        int[] actual = calc.getChange(0, 18);
        assertArrayEquals(expected, actual, "Fehler bei 0,18€");
    }
}
