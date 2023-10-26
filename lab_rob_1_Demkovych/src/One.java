public class One {
        private int a;
        private int b;
        private int c;

        public One(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void displaySum() {
            System.out.println("Сума a, b та c: " + (a+b+c));
        }

        public int multiplyNumbers(int multiplier) {
            return a * b * c * multiplier;
        }
    }


