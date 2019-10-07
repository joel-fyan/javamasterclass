public class Main {
    public static void main(String[] args) {
        int[] as = new int[]{12, 9, 15};
        int[] bs = new int[]{23, 99, 55};

        for (int i = 0; i < 3; i++) {
            String sharedPhrase = " do not share any digits";
            if(hasSharedDigit(as[i], bs[i])){
                sharedPhrase = " share at least one digit";
            }

            System.out.println(as[i] + " and " + bs[i] + sharedPhrase);
        }
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        int firstDigitA = a % 10;
        a /= 10;
        int secondDigitA = a % 10;

        int firstDigitB = b % 10;
        b /= 10;
        int secondDigitB = b % 10;

        if (firstDigitA == firstDigitB || firstDigitA == secondDigitB || secondDigitA == firstDigitB || secondDigitA == secondDigitB) {
            return true;
        }
        return false;
    }
}
