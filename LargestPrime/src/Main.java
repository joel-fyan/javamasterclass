public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {7, 217, -1, 5, -1, 45};
        int[] expectedResults = new int[] {7, 31, -1, 5, -1, 5};

        for(int i = 0; i < 6; i++) {
            System.out.println( numbers[i] + " largest prime factor is " + getLargestPrime(numbers[i]) + ". Expected " + expectedResults[i]);
        }
    }

    public static int getLargestPrime(int number) {
        if(number < 0) {
            return -1;
        }

        int max = -1;
        for(int i = 2; i <= number; i++){
            if(number % i == 0) {
                boolean isPrime = true;
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime) {
                    max = i;
                }
            }
        }

        return max;
    }
}
