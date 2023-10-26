public class Main {
    public static void main(String[] args) {
        One oneObj = new One(1, 2, 3);
        Two twoObj = new Two(2.5, 3.5, 4.5);
        Three threeObj = new Three(4, 5.5, 6.5);

        oneObj.displaySum();
        System.out.println("Результат множення у One: " + oneObj.multiplyNumbers(2));

        twoObj.displayDifference();
        System.out.println("Результат ділення у Two: " + twoObj.divideNumbers(3.0));

        threeObj.displayProduct();
        System.out.println("Результат додавання у Three: " + threeObj.addNumbers(7.5));
    }
}
