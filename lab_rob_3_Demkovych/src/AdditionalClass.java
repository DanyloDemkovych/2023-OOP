class AdditionalClass {
    private static int staticVariable1 = 10;
    private static int staticVariable2;

    // Статичний блок ініціалізації для staticVariable2
    static {
        staticVariable2 = 20;
    }

    // Статичний метод, що використовує обидві статичні змінні
    public static void staticMethod1() {
        System.out.println("Static Method 1: Змінна 1 = " + staticVariable1 + ", Змінна 2 = " + staticVariable2);
    }

    // Статичний метод, що використовує результати роботи першого методу
    public static void staticMethod2() {
        staticMethod1();
        System.out.println("Static Method 2");
    }
}
