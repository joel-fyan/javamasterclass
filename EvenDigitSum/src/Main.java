public class Main {
    public static void main(String[] args) {
        int[] inputs = new int[]{123456789, 252, -22};
        int[] expected = new int[]{20, 4, -1};

        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of even digits is " + getEvenDigitSum(inputs[i]) + ". Expected value is " + expected[i]);
        }
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
