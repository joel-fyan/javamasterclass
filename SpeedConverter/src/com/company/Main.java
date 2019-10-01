package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calls to toMilesPerHour");
        System.out.println("=======================");
        System.out.println("toMilesPerHour(1.5) " + SpeedConverter.toMilesPerHour(1.5));
        System.out.println("toMilesPerHour(10.25) " + SpeedConverter.toMilesPerHour(10.25));
        System.out.println("toMilesPerHour(-5.6) " + SpeedConverter.toMilesPerHour(-5.6));
        System.out.println("toMilesPerHour(25.42) " + SpeedConverter.toMilesPerHour(25.42));
        System.out.println("toMilesPerHour(75.114) " + SpeedConverter.toMilesPerHour(75.114));

        System.out.println();

        System.out.println("Calls to printConversion");
        System.out.println("=======================");
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }
}
