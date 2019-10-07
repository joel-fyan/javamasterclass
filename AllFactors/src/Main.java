public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {6, 32, 10, -1};

        for(int i = 0; i < 4; i++) {
            System.out.println("Factors of " + numbers[i] + " are:");
            printFactors(numbers[i]);
            System.out.println();
        }
    }

    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
