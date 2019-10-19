public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {6,28,5,-1};
        boolean[] expected = new boolean[] {true, true, false, false};

        for(int i = 0; i < 4; i++) {
            System.out.println(numbers[i] + " is a perfect number? " + isPerfectNumber(numbers[i]) + ". Expected " + expected[i]);
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1) {
            return false;
        }

        int sumDivisors = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sumDivisors += i;
            }
        }

        return sumDivisors == number;
    }
}
