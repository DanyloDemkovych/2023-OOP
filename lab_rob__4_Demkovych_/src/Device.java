public class Device {
    private String brand;
    private double price;


    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }


    private boolean turnedOn;

    public void turnOn() {
        turnedOn = true;
        System.out.println("Пристрій увімкнено.");
    }

    public boolean isTurnedOn() {

        return turnedOn;
    }


    private boolean turnedOff;

    public void turnOff() {
        turnedOn = false;
        System.out.println("Пристрій вимкнено.");
    }

    private boolean turn;

    public void setTurn(boolean turn) {

        this.turn = turn;
    }

    public boolean isTurn() {

        return turn;
    }
    // Новий метод в класі Device
    public void customMethod() {
        System.out.println("Власний метод класу Device");
    }
}
