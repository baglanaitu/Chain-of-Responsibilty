public class TCPLayer extends ApplicationLayer{
    public TCPLayer(ApplicationLayer applicationLayer) {
        super(applicationLayer);
    }
    String tcp_prefix = "010BA12";
    @Override
    String handleEncrypt(String message) {
        return applicationLayer.handleEncrypt(tcp_prefix + message);
    }
    @Override
    String handleDecrypt(String message) {
//        message = message.replaceAll("\\b(TCP_prefix )\\b(?=.*\\b\\1\\b)", "");
        message = message.replace (tcp_prefix, "");
        return applicationLayer.handleDecrypt(message);
    }

}
