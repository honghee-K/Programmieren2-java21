package WS25.Lek18.Netzwerk_Hangman;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        Hangman hg = new Hangman();
        try(ServerSocket ss = new ServerSocket(8080);
        Socket connection = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream())))
        {
            System.out.println("Wort gewählt: " + hg.getZielWort());

            hg.welcome();
            String initialStatus = "Status" + hg.zeigWort() + " | " + (hg.getVersuche() - 1);

            bw.write(initialStatus);
            bw.newLine();
            bw.flush();

            String eingabe;
            while (hg.isRunning()) {
                eingabe = br.readLine();
                String meldung = hg.rateWort(eingabe);
                String currentStatus = "Status:" + hg.zeigWort() + " | " + hg.getVersuche() + " | " + meldung;

                if (hg.allesErraten()) {
                    currentStatus  += " Sie haben gewonnen!";
                    System.out.println("Spiel beendet. Client hat gewonnen.");
                    break;
                }
                if (hg.isGameOver()){
                    currentStatus += " Sie haben verloren! Das Wort war: " + hg.getZielWort();
                    System.out.println("Spiel beendet. Client hat verloren.");
                    bw.write(currentStatus);
                    bw.newLine();
                    bw.flush();
                    break;
                }

                bw.write(currentStatus);
                bw.newLine();
                bw.flush();


                /*String endMessage;
                if (hg.allesErraten()) {
                    endMessage = "Sie haben gewonnen! Das Wort war: " + hg.getZielWort();
                    System.out.println("Spiel beendet. Client hat gewonnen.");
                } else {
                    endMessage = "Das Wort war: " + hg.getZielWort();
                    System.out.println("Spiel beendet. Client hat verloren.");
                }


                bw.write(endMessage);
                bw.newLine();
                bw.flush();
                */
            }





        } catch (IOException e) {
            System.err.println("Serverfehler oder Kommunikationsfehler: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Server beendet.");
    }
}
