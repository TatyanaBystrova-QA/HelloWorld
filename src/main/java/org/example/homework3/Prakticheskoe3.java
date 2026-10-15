package org.example.homework3;

public class Prakticheskoe3 {
    public static void main(String[] args) {
        System.out.println("Unicode " + charExpression(10));
        System.out.println("age " + getAgeDiff((byte) 100, (byte) 100));
    }

    public static char charExpression(int a) {
        return (char) (a + a);
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        if (age1 >= age2) {
            return (byte) (age1 - age2);
        } else {
            return (byte) (age2 - age1);
        }
    }
}
