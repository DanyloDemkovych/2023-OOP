class Two {
    private double x;
    private double y;
    private double z;

    Two(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void displayDifference() {
        System.out.println("Ділення x на y: " + (x - y));
    }

    double divideNumbers(double divisor) {
        return (x + y + z) / divisor;
    }

    void recursiveMethod(int count) {
        if (count > 0) {
            System.out.println("Рекурсивний виклик Two: " + count);
            recursiveMethod(count - 1);
        }
    }

    void callAnotherMethod(Two other) {
        System.out.println("Виклик методу іншого об'єкту: " + other.x);
    }

    // Новий метод
    void newMethod() {

    }

    // Зміни для завдання
    double getX() {
        return x;
    }

    void setX(double value) {
        x = value;
    }

    double getY() {
        return y;
    }

    void setY(double value) {
        y = value;
    }

    double getZ() {
        return z;
    }

    void setZ(double value) {
        z = value;
    }

    // Допоміжний метод для виклику закритого методу
    void callPrivateMethod() {
        // Логіка для закритого методу
    }
}
