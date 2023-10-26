public class Three {
    private int i;
    private double j;
    private double k;

    public Three(int i, double j, double k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public void displayProduct() {
        System.out.println("Добуток i, j та k: " + (i*j*k));
    }

    public double addNumbers(double addition) {
        return i + j + k + addition;
    }
}
