import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", 300.0);

        // Виклик методів телефону
        Scanner scanner = new Scanner(System.in);
        phone.turnOn();
        System.out.println("Введіть номер телфону для дзвінка:");
        phone.makeCall(scanner.nextLine() + "...");
        System.out.println("Абонент не відповідає(...");

        phone.turnOff();

        System.out.println("----------------------");

        Laptop laptop = new Laptop("HP", 1000.0);
        laptop.turnOn();
        System.out.println("Введіть пароль, щоб дізнатись інформацію:");
        String password = scanner.nextLine();

        if (!password.isEmpty()) {
            laptop.setBatteryLevel(54);
            laptop.checkBatteryLevel();
            laptop.charge();
        }

        laptop.turnOff();
        ExtraLogic extraLogic = new ExtraLogic();{
        extraLogic.test();
    }
    }

}