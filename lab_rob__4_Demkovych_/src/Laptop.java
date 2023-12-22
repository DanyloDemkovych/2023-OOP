public class Laptop extends Device {
    private int batteryLevel;
    public Laptop(String brand, double price) {
        super(brand, price);
    }
    @Override
    public void turnOn() {
        setTurn(true);
        System.out.println("Ноутбук " + getBrand() + " увімкнено");

    }

    @Override
    public void turnOff() {
        setTurn(false);
        System.out.println("Ціна:"+getPrice()+"$");
        System.out.println("Ноутбук " + getBrand() + " вимкнено");
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
    public void charge() {
        System.out.println("Заряджання батареї...");
        // Ваш код для симуляції заряджання батареї
        batteryLevel = 100;
        System.out.println("Батарею заряджено до 76%.");
    }
    // Новий метод в класі Laptop
    public void customMethod() {
        super.customMethod();  // Виклик методу батьківського класу
        System.out.println("Власний метод класу Laptop");
    }
}
