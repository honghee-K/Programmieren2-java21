package SS25.Uebungen.VB4.A2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// 다시
public class Client {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 9000);
                Scanner sc = new Scanner(s.getInputStream());
                BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))) {
            String input;
            while ((input = user.readLine()) != null) {
                w.write(input);
                w.newLine();
                w.flush();
                String response = r.readLine();
                System.out.println(response);
            }
        } catch (IOException e) {
            // e.printStackTrace();
            throw new RuntimeException(
                    e); // warum? ->Checked Exception(IOException) wurde zu Unchecked Exception(RuntimeException)
        }
    }
}
