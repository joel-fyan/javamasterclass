public class Main {
    public static void main(String[] args) {
        int[] as = new int[]{25, 12, 9, 81};
        int[] bs = new int[]{15, 30, 18, 153};
        int[] expected = new int[]{5, 6, -1, 9};

        for (int i = 0; i < 4; i++) {
            System.out.println(" The gcd of " + as[i] + " and " + bs[i] + " is " + getGreatestCommonDivisor(as[i], bs[i]) + ". Expected " + expected[i]);
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }


        int end = first;
        if(first > second) {
            end = second;
        }

        int gcd = 1;
        for(int i = 1; i <= end; i++) {
            if(first % i == 0 && second % i == 0 && i > gcd) {
                gcd = i;
            }
        }

        return gcd;
    }
}
