package WS25.Lek17;

import java.io.*;
import java.util.function.Consumer;

//Todo: copy Methode 만들기
// int n;
//            while((n = fis.read()) != -1){
//                fos.write(n);
//            }
public class BufferPerformanceTest {
    private static File testFile;

    public static void copyUnbuffered(){
        try (FileInputStream fis = new FileInputStream(testFile);
            FileOutputStream fos = new FileOutputStream("target/unbuffered_Output.mp3")) {
            int n;
            while((n = fis.read()) != -1){
                fos.write(n);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void copyBuffered(){
        try (FileInputStream fis = new FileInputStream(testFile);
              BufferedInputStream bis = new BufferedInputStream(fis);
              FileOutputStream fos = new FileOutputStream("target/unbuffered_Output.mp3");
              BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            int n;
            while((n = bis.read()) != -1) {
                bos.write(n);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void copyUnbufferedArray(){
        try (FileInputStream fis = new FileInputStream(testFile);
             FileOutputStream fos = new FileOutputStream("target/unbuffered_Output.mp3")) {
            int n;
            byte[] buffer = new byte[1024];
            while((n = fis.read(buffer)) != -1){
                    fos.write(buffer);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void measureTime(Consumer<String> a,String path, String type){
        System.out.println(type + ": ");
        long startTime = System.currentTimeMillis();
        a.accept(path);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(duration + " ms");


    }

    public void createTmpFile(){
        String path = "./target";
        String name = "test.mp3";
        byte[] buffer = new byte[1024];
        testFile = new File(path, name);
        if (!testFile.exists()) {
            try (FileOutputStream fos = new FileOutputStream(testFile)) {
                for (int i = 0; i < 10; i++) {
                    fos.write(buffer);
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

    public static void main(String[] args){
        BufferPerformanceTest bpt = new BufferPerformanceTest();
        bpt.createTmpFile();
        String path = "./target/test.mp3";

        // byteweise mit Hilfe eines ungepufferten Streams
        measureTime((p) -> bpt.copyUnbuffered(), path, "byteweise mit Hilfe eines ungepufferten Streams: ");
        // byteweise mit Hilfe eines gepufferten Streams
        measureTime((p) -> bpt.copyBuffered(), path, "byteweise mit Hilfe eines gepufferten Streams: ");
        // mit einem byte[] der Größe 1024 mit Hilfe eines ungepufferten Streams
        measureTime((p) -> bpt.copyUnbufferedArray(), path, "mit einem byte[] der Größe 1024 mit Hilfe eines ungepufferten Streams: ");



    }
}