class One {
    private int a;
    private int b;
    private int c;

    One(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void displaySum() {
        System.out.println("Сума a, b та c: " + (a + b + c));
    }

    int multiplyNumbers(int multiplier) {
        return a * b * c * multiplier;
    }

    void recursiveMethod(int count) {
        if (count > 0) {
            System.out.println("Рекурсивний виклик One: " + count);
            recursiveMethod(count - 1);
        }
    }

    void callAnotherMethod(One other) {
        System.out.println("Виклик методу іншого об'єкту: " + other.a);
    }

    // Новий метод для завдання 1
    void newMethod() {
        // Логіка для нового методу
    }

    // Зміни для завдання 1
    int getA() {
        return a;
    }

    void setA(int value) {
        a = value;
    }

    int getB() {
        return b;
    }

    void setB(int value) {
        b = value;
    }

    int getC() {
        return c;
    }

    void setC(int value) {
        c = value;
    }

    // Допоміжний метод для виклику закритого методу
    void callPrivateMethod() {
    }
}