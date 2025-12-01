package WS25.lek19.netzwerk_Hangman_OS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        Hangman hg = new Hangman();
        try(ServerSocket ss = new ServerSocket(8080);
        Socket connection = ss.accept();
        ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(connection.getInputStream()))
        {
            System.out.println("Wort gewählt: " + hg.getZielWort());
            System.out.println(hg.welcome());

            ServerAntwort initialStatus = new ServerAntwort(
                    "Status: " + hg.zeigWort() + " | Versuche: " + hg.getVersuche(),
                    hg.allesErraten(),
                    hg.isGameOver(),
                    false
            );

            oos.writeObject(initialStatus);
            oos.flush();

            while (hg.isRunning()) {
                GuessAttempt versuch = (GuessAttempt) ois.readObject();

                String eingabe = versuch.eingabe;
                String meldung = hg.rateWort(eingabe);
                String anzuzeigenderString = "Status: " + hg.zeigWort() + " | " + hg.getVersuche() + " | " + meldung;

                boolean istErraten = hg.allesErraten();
                boolean istBeendet = hg.isGameOver() || istErraten;
                boolean istTreffer = eingabe.length() == 1 && hg.getZielWort().contains(eingabe.toUpperCase());


                if (istErraten) {
                      anzuzeigenderString += " Sie haben gewonnen!";
                    System.out.println("Spiel beendet. Client hat gewonnen.");
                }
                if (istBeendet){
                    anzuzeigenderString += " Sie haben verloren! Das Wort war: " + hg.getZielWort();
                    System.out.println("Spiel beendet. Client hat verloren.");
                }

                ServerAntwort antwort = new ServerAntwort(anzuzeigenderString, istErraten, istBeendet, istTreffer);
                oos.writeObject(antwort);
                oos.flush();

            }

        } catch (Exception e) { // IOException | ClassNotFoundException e 문제에서 따로 처리하라고 나와있으면 따로. 아니면 같이 해도 됨
            System.err.println("Serverfehler oder Kommunikationsfehler: " + e.getMessage());
            e.printStackTrace();
        }
        /*catch (IOException e) {
            // 통신 문제 처리
            System.err.println("Kommunikationsfehler: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // readObject() 문제 처리
            System.err.println("Klassenfehler: " + e.getMessage());
            e.printStackTrace();
        }*/
        System.out.println("Server beendet.");
    }
}
