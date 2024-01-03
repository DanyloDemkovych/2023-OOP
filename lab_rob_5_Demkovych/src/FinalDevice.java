public final class FinalDevice {

    private String finalProperty;

    public FinalDevice(String finalProperty) {
        this.finalProperty = finalProperty;
    }

    public final void finalMethod() {
        System.out.println("Це final метод. Властивість: " + finalProperty);
    }

}