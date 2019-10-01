public class Main {
    public static void main(String[] args) {
        printEqual(1,1,1); // Expect "All numbers are equal"
        printEqual(1,1,2); // Expect "Neither all are equal or different"
        printEqual(-1, -1, -1); // Expect "Invalid Value"
        printEqual(1,2,3); // Expect "All numbers are different"
    }

    private static void printEqual(int a, int b, int c)
    {
        if( a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if(a == b && b == c) {
            System.out.println("All numbers are equal");
            return;
        }

        if(a == b || a == c || b == c) {
            System.out.println("Neither all are equal or different");
            return;
        }

        System.out.println("All numbers are different");
    }
}
