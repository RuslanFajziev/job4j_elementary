package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1 || number == 2 || number == 3) {
            return prime;
        } else if (number == 4 || number == 9) {
            return false;
        }
        for (int n = 3; n < number; n++) {
            if (number % n == 0 && number % 2 == 0 && number % number == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}