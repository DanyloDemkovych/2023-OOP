class Three {
    private int i;
    private double j;
    private double k;

    public Three(int i, double j, double k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public void displayProduct() {
        System.out.println("Добуток i, j та k: " + (i * j * k));
    }

    public double addNumbers(double addition) {
        return i + j + k + addition;
    }

    public void recursiveMethod(int count) {
        if (count > 0) {
            System.out.println("Рекурсивний виклик Three: " + count);
            recursiveMethod(count - 1);
        }
    }

    public void callAnotherMethod(Three other) {
        System.out.println("Виклик методу іншого об'єкту: " + other.i);
    }

    public Three modifyObject(int newI, double newJ, double newK) {
        this.i = newI;
        this.j = newJ;
        this.k = newK;
        return this;
    }

    public int getI() {
        return i;
    }

    public double getJ() {
        return j;
    }

    public double getK() {
        return k;
    }
}