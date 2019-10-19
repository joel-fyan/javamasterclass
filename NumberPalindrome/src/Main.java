public class Main {
    public static void main(String[] args) {
        int[] candidates = new int[] {707, -1221, 11212};

        for (int candidate: candidates) {

            if (isPalindrome(candidate)) {
                System.out.println(candidate + " is a palindrome");
            } else {
                System.out.println(candidate + " is not a palindrome");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        System.out.println("Checking if " + number + " is a palindrome.");
        int original = number;
        int reversed = 0;
        while(number != 0) {
            // Shift current reversed value one place value
            reversed *= 10;

            // Get next digit
            int digit = number % 10;

            // Add
            reversed += digit;

            // Get next number
            number /= 10;
        }

        if(reversed == original)
        {
            return true;
        }
        return false;
    }
}
