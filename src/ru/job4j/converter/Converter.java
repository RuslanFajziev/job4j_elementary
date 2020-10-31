package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70; /* формула перевода рублей в евро. */
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int inToEuro = 140;
        int expectedEuro  = 2;
        int outToEuro =  Converter.rubleToEuro(inToEuro);
        boolean passedToEuro = outToEuro == expectedEuro;
        System.out.println(inToEuro + " rubles are " + expectedEuro + ". Test result : " + passedToEuro);

        int inToDollar = 240;
        int expectedDollar  = 4;
        int outToDollar =  Converter.rubleToDollar(inToDollar);
        boolean passedToDollar = outToDollar == expectedDollar;
        System.out.println(inToDollar + " rubles are " + expectedDollar + ". Test result : " + passedToDollar);
    }
}
