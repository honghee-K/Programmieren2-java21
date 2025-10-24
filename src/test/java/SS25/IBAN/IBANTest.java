package SS25.IBAN;

import static org.junit.jupiter.api.Assertions.*;

import SS25.AK.IBAN.FalscheIBANException;
import SS25.AK.IBAN.IBANChecker;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class IBANTest {

    static Path file1;

    @BeforeAll
    public static void setup() throws IOException {
        file1 = Files.createTempFile("iban1", ".txt");
        //   Path file2 = Files.createTempFile("iban2", ".txt");

        Files.write(file1, List.of("DE12345678901234567890", "XX999"));
        //   Files.write(file2, List.of("DE2130120400000BY15228", "FR2130120400000BY15228"));

        //    String[] files = { file1.toString(), file2.toString() };
    }

    @Test
    public void testVaildIBAN() {
        IBANChecker ibanChecker = new IBANChecker();

        // 1. Anonymous executable
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                ibanChecker.checkIban("DF2130120400000BY1528");
            }
        };

        // 2. lambda
        Executable executable2 = () -> {
            ibanChecker.checkIban("DE2130120400000BY1");
        };
        assertThrows(FalscheIBANException.class, executable2);

        // 3. lambda mit Assertion
        assertThrows(FalscheIBANException.class, () -> {
            ibanChecker.checkIban("DE2130120400000BY1522");
        });

        assertDoesNotThrow(() -> {
            ibanChecker.checkIban("DE12345678901234567890");
        });
    }

    @Test
    public void testLiesIbanAusDatei() {
        IBANChecker ibanChecker = new IBANChecker();
        List<String> ungueltigeList = new ArrayList<>();
        ungueltigeList.add("XX999");

        assertEquals(ungueltigeList, ibanChecker.liesIbanAusDatei(file1.toString()));
    }
}
