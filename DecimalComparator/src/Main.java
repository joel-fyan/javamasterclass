public class Main {
    public static void main(String[] args) {
        System.out.println("-3.1756 and -3.175 are equal by 3 decimal places? " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        System.out.println("3.175 and 3.176 are equal by 3 decimal places? " + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
        System.out.println("3.0 and 3.0 are equal by 3 decimal places? " + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
        System.out.println("-3.123 and 3.123 are equal by 3 decimal places? " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
    }
}
