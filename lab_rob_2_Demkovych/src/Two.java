class Two {
    private double x;
    private double y;
    private double z;

    public Two(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayDifference() {
        System.out.println("Ділення x на y: " + (x - y));
    }

    public double divideNumbers(double divisor) {
        return (x + y + z) / divisor;
    }

    public void recursiveMethod(int count) {
        if (count > 0) {
            System.out.println("Рекурсивний виклик Two: " + count);
            recursiveMethod(count - 1);
        }
    }

    public void callAnotherMethod(Two other) {
        System.out.println("Виклик методу іншого об'єкту: " + other.x);
    }
}