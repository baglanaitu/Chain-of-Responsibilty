public class EthernetLayer extends ApplicationLayer{
    public EthernetLayer(ApplicationLayer applicationLayer) {
        super(applicationLayer);
    }
    String ethernet_prefix = "111CA00";
    @Override
    String handleEncrypt(String message) {
        return applicationLayer.handleEncrypt(ethernet_prefix + message);
    }

    @Override
    String handleDecrypt(String message) {
        message = message.replace (ethernet_prefix, "");
        return applicationLayer.handleDecrypt(message);
    }
}
