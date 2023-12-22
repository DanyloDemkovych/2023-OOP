class Three {
    private int i;
    private double j;
    private double k;

    Three(int i, double j, double k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    void displayProduct() {
        System.out.println("Добуток i, j та k: " + (i * j * k));
    }

    double addNumbers(double addition) {
        return i + j + k + addition;
    }

    void recursiveMethod(int count) {
        if (count > 0) {
            System.out.println("Рекурсивний виклик Three: " + count);
            recursiveMethod(count - 1);
        }
    }

    void callAnotherMethod(Three other) {
        System.out.println("Виклик методу іншого об'єкту: " + other.i);
    }

    // Новий метод
    void newMethod(){

}

    int getI() {
        return i;
    }

    void setI(int value) {
        i = value;
    }

    double getJ() {
        return j;
    }

    void setJ(double value) {
        j = value;
    }

    double getK() {
        return k;
    }

    void setK(double value) {
        k = value;
    }

    // Допоміжний метод для виклику закритого методу
    void callPrivateMethod() {

    }
    public Three modifyObject(Three obj, int newI, double newJ, double newK) {
        obj.setI(newI);
        obj.setJ(newJ);
        obj.setK(newK);
        return obj;
    }
}