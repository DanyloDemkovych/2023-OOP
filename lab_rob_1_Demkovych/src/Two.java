public class Two {
    private double x;
    private double y;
    private double z;

    public Two(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayDifference() {
        System.out.println("Ділення x на y: " + (x-y));
    }

    public double divideNumbers(double divisor) {
        return (x + y + z) / divisor;
    }

}
