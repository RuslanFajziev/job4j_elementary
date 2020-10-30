package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double xK = Math.pow(x, 2);
        double yK = Math.pow(y, 2);
        double xKy = xK + yK;
        return Math.sqrt(xKy);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 3, 2, 3);
        System.out.println("result (0, 0) to (2, 3) " + result);
    }
}