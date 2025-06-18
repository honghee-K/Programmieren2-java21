package Exercise.AK.IBAN;

public class FalscheIBANException {

    String iban;

    public FalscheIBANException() {}

    public FalscheIBANException(String iban) {
        this.iban = iban;
    }
}
