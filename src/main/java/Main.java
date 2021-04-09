public class Main {
    public static void main(String[] args) {
        ApplicationLayer encryption = new EthernetLayer(new TCPLayer(new EncryptionLayer(new messagePrint(null))));
        String encrypted_message = encryption.handleEncrypt("Hello World!"); // our message

        ApplicationLayer decryption = new EncryptionLayer(new TCPLayer(new EthernetLayer(new messagePrint(null))));
        String decrypted_message = decryption.handleDecrypt(encrypted_message);
    }
}
