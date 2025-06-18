package IBAN;

import Exercise.AK.IBAN.IBANChecker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IBANTest {

    @BeforeAll
    public static void setup() throws IOException {
        Path file1 = Files.createTempFile("iban1", ".txt");
        Path file2 = Files.createTempFile("iban2", ".txt");

        Files.write(file1, List.of("DE12345678901234567890", "XX999"));
        Files.write(file2, List.of("DE2130120400000BY15228", "FR2130120400000BY15228"));

        String[] files = { file1.toString(), file2.toString() };
    }

    //assertThrows? 뭘 사용해야해?
    @Test
    public void testVaildIBAN(){
        IBANChecker ibanChecker = new IBANChecker();

    }
}
