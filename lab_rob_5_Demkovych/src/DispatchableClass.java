interface Dispatchable {
    void performAction();
}

//кдас для динамічної диспетчеризації
class DispatchableClass extends Device implements Dispatchable {
    public DispatchableClass(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void performAction() {
        //логіка
        System.out.println("виконано линамічну диспетчеризацію для " + getBrand());
    }
}