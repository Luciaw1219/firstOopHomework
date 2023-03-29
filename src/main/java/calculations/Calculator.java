package calculations;

public class Calculator {

    public void add(int addend1, int addend2) {
        int sum = addend1 + addend2;
        System.out.println(sum);
    }

    public void subtract(double number1, double number2) {
        double difference = number1 - number2;
        System.out.println(difference);
    }

    public void multiply(int factor1, int factor2) {
        int product = factor1 * factor2;
        System.out.println(product);
    }

    public void divide(double dividend, double divisor) {
        double quotient = dividend / divisor;
        System.out.println(quotient);
    }
}
