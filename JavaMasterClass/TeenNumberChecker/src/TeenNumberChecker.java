class TeenNumberChecker {
    static boolean hasTeen(int a, int b, int c)
    {
        return isInRange(a) || isInRange(b) ||  isInRange(c);
    }

    private static boolean isInRange(int age)
    {
        return age > 12 && age < 20;
    }
}
