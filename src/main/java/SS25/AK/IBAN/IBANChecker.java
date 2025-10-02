package SS25.AK.IBAN;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IBANChecker {

    public void checkIban(String iban){
        char[] arr = iban.toCharArray();
        if (arr[0] != 'D' || arr[1] != 'E' || arr.length != 22) {
            throw new FalscheIBANException("Ungültige IBAN: " + iban);
        }
    }

    public List<String> liesIbanAusDatei(String dateiname){
        List<String> unguetligeIbans = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(dateiname))){
            String line;
            while((line = br.readLine()) != null){
                try{
                    checkIban(line);
                } catch (FalscheIBANException e){
                    unguetligeIbans.add(line);
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return unguetligeIbans;
    }

    public Map<String, List<String>> liesIbanAusDateien(String[] dateinamen){
        Map<String, List<String>> ungueltigeDateien = new HashMap<>();

        for(String dateiname : dateinamen){
            List<String> unguetligeIbans = liesIbanAusDatei(dateiname);
            ungueltigeDateien.put(dateiname, unguetligeIbans);
        }

        return ungueltigeDateien;
    }
}
