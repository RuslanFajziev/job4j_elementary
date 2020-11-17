package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salarySt = 10;
        int salaryBig = 15;
        int norma = 8;
        int salaryAll = 0;
        for (int index = 0; index < hours.length; index++) {
            if (index < 5) {
                if (hours[index] <= norma && hours[index] > 0) {
                    salaryAll += hours[index] * salarySt;
                } else if (hours[index] > norma) {
                    salaryAll += (hours[index] - norma) * salaryBig + norma * salarySt;
                }
            } else {
                if (hours[index] <= norma && hours[index] > 0) {
                    salaryAll += hours[index] * salarySt * 2;
                } else if (hours[index] > norma) {
                    salaryAll += (hours[index] - norma) * salaryBig * 2 + norma * salarySt * 2;
                }
            }
        }
        return salaryAll;
    }
//
//    public static void main(String[] args) {
//        int[] hours = {10, 10, 10, 0, 8, 0, 0};
//        System.out.println(WeeklySalary.calculate(hours));
//    }
}