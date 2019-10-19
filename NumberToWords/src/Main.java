public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {0,123,-12,5200};

        for(int i=0; i < 4; i++) {
            System.out.println(numbers[i] + " in words is:");
            numberToWords(numbers[i]);
        }
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }

        if(number == 0){
            return 1;
        }

        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }

        return count;
    }
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        if(number == 0) {
            System.out.println("Zero");
        }

        int digitCount = getDigitCount(number);

        int reversed = reverse(number);
        int reversedDigitCount = getDigitCount(reversed);

        while(reversed != 0) {
            int digit = reversed % 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversed /= 10;
        }

        int digitCountDifference = digitCount - reversedDigitCount;
        for(int i = 0; i < digitCountDifference; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        int reversed = 0;
        while(number != 0){
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }

        return reversed;
    }
}
