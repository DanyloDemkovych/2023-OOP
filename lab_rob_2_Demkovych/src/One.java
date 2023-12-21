class One {
    private int a;
    private int b;
    private int c;

    public One(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void displaySum() {
        System.out.println("Сума a, b та c: " + (a + b + c));
    }

    public int multiplyNumbers(int multiplier) {
        return a * b * c * multiplier;
    }

    public void recursiveMethod(int count) {
        if (count > 0) {
            System.out.println("Рекурсивний виклик One: " + count);
            recursiveMethod(count - 1);
        }
    }

    public void callAnotherMethod(One other) {
        System.out.println("Виклик методу іншого об'єкту: " + other.a);
    }
}