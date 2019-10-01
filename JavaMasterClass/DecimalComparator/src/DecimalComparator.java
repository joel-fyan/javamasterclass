class DecimalComparator {
    static boolean areEqualByThreeDecimalPlaces(double first, double second)
    {
        int firstInt = (int)(first * 1000);
        int secondInt = (int)(second * 1000);

        return firstInt == secondInt;
    }
}
