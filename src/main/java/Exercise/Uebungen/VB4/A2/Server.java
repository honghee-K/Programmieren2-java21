package Exercise.Uebungen.VB4.A2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try (ServerSocket ss = new ServerSocket(9000);
                Socket client = ss.accept();
                BufferedReader r = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {
            String line;
            while ((line = r.readLine()) != null) {
                boolean palindrom = true;
                if (new StringBuilder(line).reverse().toString().equals(line)) w.write("Palindrome");
                else w.write("Kein Palindrom");
                w.newLine();
                w.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
