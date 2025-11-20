package WS25.Lek18.Netzwerk_Hangman;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Socket connection = new Socket("localhost", 8080);
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
             BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))

        ) {
            System.out.println("Verbunden mit dem Server.");
            String res = br.readLine();
            if (res == null) {
                System.out.println("Verbindung sofort beendet.");
                return;
            }

            System.out.println(res);

            while (true) {
                System.out.print("Ihre Eingabe: ");
                String in = scanner.nextLine();
                bw.write(in);
                bw.newLine();
                bw.flush();

                res = br.readLine();
                System.out.println(res);
                if (res == null) break;
                if (res.contains("gewonnen") || res.contains("verloren")){
                    break;
                }




            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("Exiting ...");
        }
    }
}
