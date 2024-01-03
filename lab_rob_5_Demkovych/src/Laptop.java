public class Laptop extends Device {
    private int batteryLevel;
    public Laptop(String brand, double price) {
        super(brand, price);
    }
    @Override
    public void turnOn() {
        setTurn(true);
        System.out.println("Ноутбук " + super.getBrand() + " увімкнено");
    }

    @Override
    public void turnOff() {
        setTurn(false);
        System.out.println(" ");
        System.out.println("Info:");
        System.out.println("Ціна:" + super.getPrice() + "$");
        System.out.println("Ноутбук " + super.getBrand() + " вимкнено");
    }

    public int getBatteryLevel() {

        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {

        this.batteryLevel = batteryLevel;
    }

    public void checkBatteryLevel() {

        System.out.println("Рівень заряду батареї: " + batteryLevel + "%");
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Виклик методу батьківського класу
        System.out.println("Рівень заряду батареї: " + getBatteryLevel() + "%");
    }
    public void charge() {
        System.out.println("Заряджання батареї...");
        // Ваш код для симуляції заряджання батареї
        batteryLevel = 100;
        System.out.println("Батарею заряджено до 76%.");
    }
}
