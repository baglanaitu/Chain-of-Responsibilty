abstract class ApplicationLayer {
    ApplicationLayer applicationLayer;

    public ApplicationLayer(ApplicationLayer applicationLayer) {
        this.applicationLayer = applicationLayer;
    }

    abstract String handleEncrypt(String message);
    abstract String handleDecrypt(String message);
}
