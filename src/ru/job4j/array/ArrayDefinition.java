package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println("Размер массива равен: " + ages[0] + " " + ages[1]);
        System.out.println("Размер массива равен: " + surnames[0] + " " + surnames[1]);
        System.out.println("Размер массива равен: " + prices[0] + " " + prices[1]);

        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Petr Arsentev2";
        names[2] = "Petr Arsentev3";
        names[3] = "Petr Arsentev4";
        int cycle = names.length - 1;
        int start = 0;
        while (start <= cycle) {
            System.out.println(names[start]);
            start++;
        }


    }
}
