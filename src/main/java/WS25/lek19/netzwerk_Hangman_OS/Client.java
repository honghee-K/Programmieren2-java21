package WS25.lek19.netzwerk_Hangman_OS;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Socket connection = new Socket("localhost", 8080);
             ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(connection.getInputStream())

        ) {
            System.out.println("Verbunden mit dem Server.");
            ServerAntwort initialAntwort = (ServerAntwort) ois.readObject();
            System.out.println(initialAntwort.anzuzeigenderString);

            while (true) {
                System.out.print("Ihre Eingabe: ");
                String in = scanner.nextLine();

                GuessAttempt versuch = new GuessAttempt(in);
                oos.writeObject(versuch);
                oos.flush();

                ServerAntwort antwort = (ServerAntwort) ois.readObject();
                System.out.println(antwort.anzuzeigenderString);

                if (antwort.istErraten) {
                    System.out.println("Spiel beendet. Du hast gewonnen.");
                }
                if (antwort.istBeendet){
                    System.out.println("Spiel beendet. Du hast verloren.");
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
