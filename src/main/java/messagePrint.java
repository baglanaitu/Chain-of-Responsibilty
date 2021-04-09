public class messagePrint extends ApplicationLayer{
    public messagePrint(ApplicationLayer applicationLayer) {
        super(applicationLayer);
    }

    @Override
    String handleEncrypt(String message) {
        System.out.println("Encrypted message: " + message);
        return message;
    }
    @Override
    String handleDecrypt(String message) {
        System.out.println("Decrypted message: " + message);
        return message;
    }
}
