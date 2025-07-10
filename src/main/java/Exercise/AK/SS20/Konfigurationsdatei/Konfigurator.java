package Exercise.AK.SS20.Konfigurationsdatei;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Konfigurator {
    public  List<String> liesKonfigurationsdatei() throws IOException {
        List<String> konfigurations = new ArrayList<>();
            try(BufferedReader br = new BufferedReader(new InputStreamReader(
                    getClass().getClassLoader().getResourceAsStream("Konfigurationsdatei.txt")))){
        String line;
        while((line = br.readLine()) != null){
            konfigurations.add(line);
        }
    }
    return konfigurations;
    }

    public Map<String, String> teilKonfigurationsdateiAuf(){
        Map<String, String> konfigurations = new HashMap<>();
        int gleichheitszeichenIdx = 0;
        try{
            for(String s : liesKonfigurationsdatei()){
                gleichheitszeichenIdx = s.indexOf("=");
                konfigurations.put(s.substring(0, gleichheitszeichenIdx), s.substring(gleichheitszeichenIdx+1));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return konfigurations;
    }
}
