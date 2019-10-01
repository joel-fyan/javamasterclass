public class Main {
    public static void main(String[] args) {
        System.out.println("Is 1700 a leap year? " + LeapYearCalculator.isLeapYear(1700)); // Expect false
        System.out.println("Is 1800 a leap year? " + LeapYearCalculator.isLeapYear(1800)); // Expect false
        System.out.println("Is 1900 a leap year? " + LeapYearCalculator.isLeapYear(1900)); // Expect false
        System.out.println("Is 2100 a leap year? " + LeapYearCalculator.isLeapYear(2100)); // Expect false
        System.out.println("Is 2300 a leap year? " + LeapYearCalculator.isLeapYear(2300)); // Expect false
        System.out.println("Is 2500 a leap year? " + LeapYearCalculator.isLeapYear(2500)); // Expect false
        System.out.println("Is 2600 a leap year? " + LeapYearCalculator.isLeapYear(2600)); // Expect false

        System.out.println("Is 1600 a leap year? " + LeapYearCalculator.isLeapYear(1600)); // Expect true
        System.out.println("Is 1600 a leap year? " + LeapYearCalculator.isLeapYear(2000)); // Expect true
        System.out.println("Is 1600 a leap year? " + LeapYearCalculator.isLeapYear(2400)); // Expect true

    }
}
