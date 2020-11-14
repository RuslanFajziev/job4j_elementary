package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int index = 0; index < coins.length; index++) {
            while (change > 0) {
                if (change >= coins[index]) {
                    change -= coins[index];
                    rsl[size] = coins[index];
                    size++;
                } else  {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}