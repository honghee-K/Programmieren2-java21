package SS25.AK.SS17.IBAN;

public class FalscheIBANException extends RuntimeException{

  public FalscheIBANException(){
    super("FEHLER: Datei enthält ungültige IBAN");
  }

  public FalscheIBANException(String str){
    super(str);
  }
}
