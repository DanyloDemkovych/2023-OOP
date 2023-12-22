class FinalClass {
    // Завершені (final) змінні екземпляра класу з ініціалізацією
    private final int finalVariable1 = 5;
    private final double finalVariable2 = 3.14;
    private final String finalVariable3;

    // Конструктор для ініціалізації finalVariable3
    public FinalClass(String value) {
        this.finalVariable3 = value;
    }

    // Перший метод, логікою якого передбачено використання усіх змінних екземпляра класу оголошених як final
    public void firstMethod() {
        System.out.println("First Method: " + finalVariable1 + ", " + finalVariable2 + ", " + finalVariable3);
    }

    // Другий метод, логікою якого передбачено створення та використання локальних змінних оголошених як final
    public void secondMethod() {
        final int localVar1 = 10;
        final String localVar2 = "Hello, final!";
        System.out.println("Second Method: " + localVar1 + ", " + localVar2);
    }
}