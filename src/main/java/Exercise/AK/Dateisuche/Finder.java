package Exercise.AK.Dateisuche;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finder {

    //Byte-Stream der Tastatureingabe(System.in) -> Character-Stream = InputStreamReader
    public BufferedReader getSystemInAsBufferedReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br;
    }

    public void findStringInFiles(String searchString, String[] filenames)   {
        for(String filename : filenames){
            try(BufferedReader br = new BufferedReader(new FileReader(filename))){
                String line = "";
                int lineNum = 1;
                while((line = br.readLine()) != null){
                    if(line.contains(searchString)) {
                        System.out.println(searchString + "wurde in der Datei " + filename + " in der " + lineNum + "-ten Zeile gefunden.");
                    }
                    lineNum++;
                }
            } catch(IOException e){
                System.out.println("Der Datei wurde nicht geöffenet.");
            }
        }

    }
    public static void main(String[] args)
    {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        };
    }
}
