package IBAN;

import Exercise.AK.IBAN.FalscheIBANException;
import Exercise.AK.IBAN.IBANChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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
    public void testVaildIBAN(){
        IBANChecker ibanChecker = new IBANChecker();

        //Annoyance executable
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                ibanChecker.checkIban("DF2130120400000BY1528");
            }
        };
        //lambda
        Executable executable2 = () -> {
            ibanChecker.checkIban("DE2130120400000BY1");
        };
        Executable executable3 = () -> {
            ibanChecker.checkIban("DE2130120400000BY15228");
        };

        Assertions.assertThrows(FalscheIBANException.class, executable);
        Assertions.assertThrows(FalscheIBANException.class, executable2);
        Assertions.assertDoesNotThrow(executable3);
    }

    @Test
    public void testLiesIbanAusDatei(){
        IBANChecker ibanChecker = new IBANChecker();
        List<String> ungueltigeList = new ArrayList<>();
        ungueltigeList.add("XX999");

        Assertions.assertEquals(ungueltigeList, ibanChecker.liesIbanAusDatei(file1.toString()));
    }
}
