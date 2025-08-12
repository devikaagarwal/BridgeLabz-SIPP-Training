package GENERICS.Regix_And_JUnit.JUnit;

public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        try {
            System.out.println("Division: " + calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Division: " + calculator.divide(5, 2));
    }
}

