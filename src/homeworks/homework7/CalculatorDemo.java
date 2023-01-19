package homeworks.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.plus(5, 2));
        System.out.println(calc.minus(2, 1));
        System.out.println(calc.multiply(2, 2));
        System.out.println(calc.divide(10, 0));
    }

}
