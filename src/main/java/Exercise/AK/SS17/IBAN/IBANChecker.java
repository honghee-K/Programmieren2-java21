package Exercise.AK.SS17.IBAN;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IBANChecker {
  String iban;

  public IBANChecker(String iban){
    this.iban = iban;
  }

  public boolean ibanCheck(String iban) {
    if(iban.startsWith("DE") && iban.length() == 20){
      return true;
    } else {
      throw new FalscheIBANException("Biffe prüfen Sie nochmal deine IBAN. Angabe der falschen IBAN: " + iban );
    }

  }

  public void ibanAusDateiLesen(String dateiname){

    try(BufferedReader br = new BufferedReader(new FileReader(dateiname))){
      String line;
      while((line = br.readLine()) != null){
        if(ibanCheck(line)){
          System.out.println("Die IBAN wurde erfolreich gelesen");
        } else {}
      }
      } catch(FileNotFoundException e){
        System.out.println("Fehler beim Lesevorgang von Datei: <" + dateiname + ">");
      } catch(IOException e){
        System.out.println("Datei <" + dateiname + "> nicht gefunden");
      }  catch(NullPointerException e){
        System.out.println("Datei <" + dateiname + "> exisitert nicht");
      }
    }

    public void dateienTest(String dateinamen){

    }
}

