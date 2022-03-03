public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();


        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // возможное деление на 0
        int d = calc.multiply.apply(10,20);
        int f = calc.pow.apply(5);
        int g = calc.abs.apply(2);
        boolean e = calc.isPositive.test(5);
        calc.println.accept(c);

        System.out.println(e);
    }
}
