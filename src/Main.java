public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b); // возможное деление на 0
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0!");
        }

        int d = calc.multiply.apply(10, 20);
        int f = calc.pow.apply(10);
        int g = calc.abs.apply(2);
        boolean e = calc.isPositive.test(5);
        calc.println.accept(f);
        System.out.println(e);
    }
}
