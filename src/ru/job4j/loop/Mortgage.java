package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        for (int n = 1; n > 0; n++) {
            year = n;
            double amountPercent = amount + (amount * percent / 100);   // кредит+проценты
            amount = amountPercent - salary;                  // остаток
            if (amount < 0) {
                break;
            }
        }
        return year;
    }
}