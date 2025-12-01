package WS25.lek18.Splitter;

import java.io.*;

public class Studiengangssplitter {

    public void splitStudiengaenge(String dateiname) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(dateiname));
        BufferedWriter winfBw = new BufferedWriter(new FileWriter("/home/hong/Workspace/Programmieren2-java21/src/main/java/WS25/Lek18/Splitter/WInfNr.txt"));
        BufferedWriter infBw = new BufferedWriter(new FileWriter("/home/hong/Workspace/Programmieren2-java21/src/main/java/WS25/Lek18/Splitter/InfNr.txt"));
        BufferedWriter ecBw = new BufferedWriter(new FileWriter("/home/hong/Workspace/Programmieren2-java21/src/main/java/WS25/Lek18/Splitter/ECNr.txt"));) {

            String line;
            while((line = br.readLine()) != null) {
                if (line.trim().length() != 7) {
                    throw new MatrikelNummerException("Ungültige Matrikelnummer Länge: " + line);
                }
                int num = Integer.parseInt(line.trim());

                if (5000000 <= num && 5099999 >= num) {
                    winfBw.write(line);
                    winfBw.newLine();
                } else if (5100000 <= num && 5199999 >= num) {
                    infBw.write(line);
                    infBw.newLine();
                } else if (6100000 <= num && 6199999 >= num) {
                    ecBw.write(line);
                    ecBw.newLine();
                } /*else {
                    throw new MatrikelNummerException("Ungültige Matrikelnummer: " + line);
                }*/
            }
        }


    }

    public static void main (String[] args){
        Studiengangssplitter sp = new Studiengangssplitter();
        try{
            sp.splitStudiengaenge("/home/hong/Workspace/Programmieren2-java21/src/main/java/WS25/Lek18/Splitter/MatrNr.txt");

        } catch(MatrikelNummerException e){
            System.out.println("Ungültige Matrikelnummer" + e.getMessage());
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
