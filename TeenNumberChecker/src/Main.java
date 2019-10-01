public class Main {
    public static void main(String[] args) {
        System.out.println("hasTeen(9,99,19)? " + TeenNumberChecker.hasTeen(9,99,19)); // true 19 is in range 13 - 19
        System.out.println("hasTeen(23,15,42)? " + TeenNumberChecker.hasTeen(23,15,42)); // true 15 is in range 13 - 19
        System.out.println("hasTeen(22,23,34)? " + TeenNumberChecker.hasTeen(22, 23, 34)); // false none is in range 13 - 19
    }
}
