public class Main {
    public static void main(String[] args) {
        if(isPalindrome(707))
        {
            System.out.println(707 + " is a palindrome");
        }
        else
        {
            System.out.println(707 + " is not a palindrome");
        }

        if(isPalindrome(-1221))
        {
            System.out.println(-1221 + " is a palindrome");
        }
        else
        {
            System.out.println(-1221 + " is not a palindrome");
        }


        if(isPalindrome(11212))
        {
            System.out.println(11212 + " is a palindrome");
        }
        else
        {
            System.out.println(11212 + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        System.out.println("Checking if " + number + " is a palindrome.");
        int original = number;
        int reversed = 0;
        while(number != 0) {

            System.out.println("Current multiplier");
            // Shift current reversed value one place value
            reversed *= 10;

            // Get next digit
            int digit = number % 10;
            System.out.println("Current digit = " + digit);
            // Add
            reversed += digit;
            System.out.println("Current reversed = " + reversed);

            // Get next number
            number /= 10;
            System.out.println("Next number = " + number);
        }

        if(reversed == original)
        {
            return true;
        }
        return false;
    }
}
