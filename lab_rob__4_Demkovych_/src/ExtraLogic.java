class ExtraLogic {
    private int extraField = 42;

    public void test() {
        System.out.println("Тест:");
        InnerClass inner = new InnerClass();
        inner.useOuterField();
    }

    class InnerClass {
        void useOuterField() {
            System.out.println("Внутрішній Клас: " + extraField);
        }
        // Новий метод в класі ExtraLogic
        public void customMethod() {
            System.out.println("Власний метод класу ExtraLogic");
        }
    }
}