public class Main {
    public static void main(String[] args) {
        System.out.println("hasEqualSum(1,1,1)? " + EqualSumChecker.hasEqualSum(1,1,1)); // false 1 + 1 not equal to 1
        System.out.println("hasEqualSum(1,1,2)? " + EqualSumChecker.hasEqualSum(1,1,2)); // true 1 + 1 is equal to 2
        System.out.println("hasEqualSum(-1,1,0)? " + EqualSumChecker.hasEqualSum(-1, 1, 0)); // true -1 + 1 is equal to 0
    }
}
