package SS25.Uebungen.VB3;

import java.io.*;

public class DateiKopieohneBuffer {
    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("quelle.dat");
                OutputStream os = new FileOutputStream("ziel.dat")) {
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
