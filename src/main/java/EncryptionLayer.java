public class EncryptionLayer extends ApplicationLayer{
    public EncryptionLayer(ApplicationLayer applicationLayer) {
        super(applicationLayer);
    }
    private String key = "ImageProcessingAndComputerVision"; // key for encryption

    @Override
    String handleEncrypt(String message) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++)
            sb.append((char)(message.charAt(i) ^ key.charAt(i % key.length())));
        String result = sb.toString();
        return applicationLayer.handleEncrypt(result);
    }
    @Override
    String handleDecrypt(String message) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++)
            sb.append((char)(message.charAt(i) ^ key.charAt(i % key.length())));
        String result = sb.toString();
        return applicationLayer.handleDecrypt(result);
    }

}
