class TeenNumberChecker {
    static boolean hasTeen(int a, int b, int c)
    {
        return isTeen(a) || isTeen(b) ||  isTeen(c);
    }

    private static boolean isTeen(int age)
    {
        return age > 12 && age < 20;
    }
}
