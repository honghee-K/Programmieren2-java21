package WS25.lek19;

import WS25.lek19.browser.Browser;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BrowserTest {

    @Test
    void testBackOptionalHasValueOrEmpty() {
        Browser browser = new Browser();
        Optional<URL> result = browser.back();

        if (result.isPresent()) {
            assertNotNull(result.get());
        } else {
            assertTrue(result.isEmpty());
        }
    }
}
