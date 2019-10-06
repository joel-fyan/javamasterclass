public class Main {
    public static void main(String[] args) {
        System.out.println("Sum digits in 125 is 8 -> 1 + 2 + 5 = " + sumDigits(125));
        System.out.println("Sum digits in -125 is -1 -> negative so " + sumDigits(-125));
        System.out.println("Sum digits in 4 is -1 -> less than 10 so " + sumDigits(4));
        System.out.println("Sum digits in 32123 is 11 -> 3 + 2 + 1 + 2 + 3 = " + sumDigits(32123));
    }

    private static int sumDigits(int number)
    {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
