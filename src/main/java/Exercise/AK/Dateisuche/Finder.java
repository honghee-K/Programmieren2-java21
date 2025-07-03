package Exercise.AK.Dateisuche;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finder {

    //Byte-Stream der Tastatureingabe(System.in) -> Character-Stream = InputStreamReader
    public BufferedReader getSystemInAsBufferedReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    return br;
    }

    public void findStringInFiles(String searchString, String[] filenames)   {
        for (String filename : filenames) {
            try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filename))) {
                String line;
                int lineNumber = 1;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(searchString)) {
                        System.out.println("Treffer in Datei " + filename + ", Zeile " + lineNumber + ": " + line);
                    }
                    lineNumber++;
                }
            } catch (IOException e) {
                System.out.println("Datei konnte nicht geöffnet werden: " + filename);
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
}
