package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-5);
    }

    @SuppressWarnings("checkstyle:EmptyBlock")
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Cloud not div by 0.");
        }

        if (number < 0) {
            System.out.println("This is negative numbers");
        }

        if (number > 0) {
            System.out.println("This is positive numbers");
        }
    }
}