package day08_scanner_logical_operators;

public class SignType {
    public static void main(String[] args) {
        int number = -16;


        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is positive: " + isPositive);
        System.out.println(number + " is negative: " + isNegative);
        System.out.println(number + " is zero: " + isZero);

    }
}
