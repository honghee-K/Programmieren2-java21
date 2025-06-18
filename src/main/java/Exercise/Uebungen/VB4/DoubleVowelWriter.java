package Exercise.Uebungen.VB4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// ??? 왜 생성자에 Writer를 인자로 받지?
public class DoubleVowelWriter extends Writer {

    Writer out;

    public DoubleVowelWriter(Writer out) {
        this.out = out;
    }

    @Override
    public void write(int c) throws IOException {
        char ch = (char) c;
        out.write(c);
        if ("aeuoiAEIOU".indexOf(ch) >= 0) {
            out.write(c);
        }
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        out.write(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }

    public static void main(String[] args) {
        try (DoubleVowelWriter dvw = new DoubleVowelWriter(new FileWriter("test.txt"))) {
            char[] arr = "haus".toCharArray();
            for (int i = 0; i < arr.length; i++) {
                dvw.write(arr[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
