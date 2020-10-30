package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short heightM) {
        return (heightM - 100) * 1.15;
    }

    public static double womanWeight(short heightW) {
        return  (heightW - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightM = 187;
        double man = Fit.manWeight(heightM);
        System.out.println("Man " + heightM + " is " + man);
        short heightW = 162;
        double woman = Fit.womanWeight(heightW);
        System.out.println("Woman " + heightW + " is " + woman);
    }
}
