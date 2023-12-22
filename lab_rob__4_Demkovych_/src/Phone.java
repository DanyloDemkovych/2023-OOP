public class Phone extends Device {
    private String phoneNumber;

    public Phone(String brand, double price) {
        super(brand, price);

    }

    @Override
    public void turnOn() {
        setTurn(true);
        System.out.println("Телефон " + getBrand() + " увімкнено");


    }

    @Override
    public void turnOff() {
        setTurn(false);
        System.out.println(" ");
        System.out.println("Info:");
        System.out.println("Ціна:" + getPrice() + "$");
        System.out.println("Телефон " + getBrand() + " вимкнено");
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }
    // Новий метод в класі Phone
    public void customMethod () {
        super.customMethod();  // Виклик методу батьківського класу
        System.out.println("Власний метод класу Phone");
    }

    public void makeCall(String phoneNumber) {
        if (isTurn()) {
            System.out.println("Виконується дзвінок на номер " + phoneNumber);
        } else {
            System.out.println("Неможливо дозвонитись. Телефон виключено, або він поза зоною досяжності.");
        }



    }
}
