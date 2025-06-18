package Exercise.AK.IBAN;

public class FalscheIBANException extends RuntimeException  { //unchecked

    public FalscheIBANException() {
        super("Ungültige IBAN");
    }

    public FalscheIBANException(String message) {
        super(message);
    }


}
