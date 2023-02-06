package calculator;

public class CalculatorWrapper {

    public static void main(String[] args) {
        Calculator anonymousCalculator = new Calculator() {
            @Override
            public long sum(long val1, long val2) {
                return val1 + val2;
            }

            @Override
            public long subtraction(long val1, long val2) {
                return val1 / val2;
            }
        };
        System.out.println(anonymousCalculator.sum(2, 3));
        System.out.println(anonymousCalculator.subtraction(6, 3));
    }
}