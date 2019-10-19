public class Main {
    public static void main(String[] args) {
        int[] inputs = new int[] {252,257,0,5,-5};
        int[] expected = new int[] {4,9,0,10,-1};

        for (int i = 0; i < 5; i++) {
            System.out.println("Sum first and last is " + sumFirstAndLastDigit(inputs[i]) + ". Expected value is " + expected[i]);
        }
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0) {
            return -1;
        }

        int first = number % 10;
        int last = first;

        number /= 10;

        while(number > 0) {
            last = number % 10;
            number /=10;
        }

        return first += last;
    }
}
