package org.example.homework1;

public class Prakticheskoe1 {
    public static void main(String[] args) {
        System.out.println("Monitors " + drawsMonitorsCounter(10, 3));
        System.out.println("Calculation " + priceCalculation(8.5, 2));
        calcCircleRadius(123);
    }

    public static int drawsMonitorsCounter(int monitors, int programmers) {
        int draws = monitors % programmers;
        return draws;
    }

    public static double priceCalculation(double price, int count) {
        return price * count;
    }

    public static void calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("Radius %.3f", radius);
    }
}
