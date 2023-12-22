public class Main {
    public static void main(String[] args) {
        One oneObj = new One(1, 2, 3);
        Two twoObj = new Two(2.5, 3.5, 4.5);
        Three threeObj = new Three(4, 5.5, 6.5);

        // Виклик перевизначеного методу
        oneObj.displaySum();
        System.out.println("Результат множення у One: " + oneObj.multiplyNumbers(2));
        // Виклик перевизначеного методу та перевантаженого статичного методу
        twoObj.displayDifference();
        System.out.println("Результат ділення у Two: " + twoObj.divideNumbers(3.0));
        // Виклик перевизначеного методу та перевантаженого статичного методу
        threeObj.displayProduct();
        System.out.println("Результат додавання у Three: " + threeObj.addNumbers(7.5));
        // Виклик методу, який приймає екземпляр того ж класу
        threeObj.callAnotherMethod(threeObj);
        // Виклик методу посилкового типу
        Three newThreeObj = new Three(0, 0, 0);
        newThreeObj = threeObj.modifyObject(newThreeObj, 10, 3.0, 4.0);
        System.out.println("Змінені значення у Three: i=" + newThreeObj.getI() +
                ", j=" + newThreeObj.getJ() + ", k=" + newThreeObj.getK());
        // Виклик рекурсивного методу
        oneObj.recursiveMethod(3);
        // Виклик нових методів 2 завд.
        callPrivateMethods(oneObj);
        callPrivateMethods(twoObj);
        callPrivateMethods(threeObj);
        // Виклик статичних методів нового класу
        AdditionalClass.staticMethod1();
        AdditionalClass.staticMethod2();
    }
    // Допоміжний метод для виклику закритих методів класів
    private static void callPrivateMethods(One obj) {
        obj.callPrivateMethod();
    }
    private static void callPrivateMethods(Two obj) {
        obj.callPrivateMethod();
    }
    // Виклик методів нового класу для завдання 4
    FinalClass finalVarObj = new FinalClass("Final Variable");{

        finalVarObj.firstMethod();
        finalVarObj.secondMethod();
    }
    private static void callPrivateMethods(Three obj) {
        obj.callPrivateMethod();
    }



}

