package WS25.lek17;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OutputStreamTest {

    private FileOutputStream fos;
    private File testFile;
    private File baseDir;
    private byte[] data;

    @BeforeEach
    public void setUp() throws IOException{
        String dirPath = "./target/temp";
        String fileName = "output";

        baseDir = new File(dirPath);

        if(!baseDir.exists()){
            baseDir.mkdirs();
        }

        testFile = new File(baseDir, fileName);
        fos = new FileOutputStream(testFile);
        data = new byte[10];
    }
    @Test
    public void testNegativeOff(){ //IndexOutOfBoundsException
        assertThrows(RuntimeException.class, () ->{
            fos.write(data, -1, 5);
        });
    }

    @Test
    public void testLongLength(){ // IndexOutOfBoundsException
        assertThrows(RuntimeException.class, () ->{
            fos.write(data, 3, 11);
        });
    }

    @AfterEach
    public void tearDown(){
        try {
            if(fos != null) fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(testFile != null && testFile.exists()){
            testFile.delete();
        }
        if(baseDir != null && baseDir.exists()){
            baseDir.delete();
        }
    }
}
