public class Main {
    public static void main(String[] args) {
        int[] as = new int[]{41, 23, 9};
        int[] bs = new int[]{22, 32, 99};
        int[] cs = new int[]{71, 42, 999};

        for (int i = 0; i < 3; i++) {
            String sharedPhrase = " do not ";
            if(hasSameLastDigit(as[i], bs[i], cs[i])){
                sharedPhrase = " do ";
            }

            System.out.println(as[i] + ", " + bs[i] + " or " + cs[i] + sharedPhrase + "share a last digit");
        }
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int aLast =  a % 10;

        int bLast = b % 10;

        int cLast = c % 10;

        return aLast == bLast || aLast == cLast || bLast == cLast;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
