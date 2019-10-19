public class Main {
    public static void main(String[] args) {
        int[] bigCounts = new int[] {1,1,0,2,-3};
        int[] smallCounts = new int[] {0,0,5,2,2};
        int[] goals = new int[] {4,5,4,11,12};
        boolean[] expectedResults = new boolean[]{false, true, true, true, false};

        for(int i = 0; i < 5; i++)
        {
            System.out.println("canPack " + goals[i] + " with " + bigCounts[i] + " big and " + smallCounts[i] + " small bags of flour? " + canPack(bigCounts[i], smallCounts[i], goals[i]) + ". Expected " +  expectedResults[i]);
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int currentAmountOfFlour = 0;
        for (int i = 0; i < bigCount;  i++){
            if((currentAmountOfFlour < goal) && (currentAmountOfFlour + 5 <= goal)) {
                currentAmountOfFlour += 5;
            }
        }

        if(currentAmountOfFlour != goal)
        {
            for (int i = 0; i < smallCount;  i++){
                if((currentAmountOfFlour < goal) && (currentAmountOfFlour + 1 <= goal)) {
                    currentAmountOfFlour += 1;
                }
            }
        }

        return currentAmountOfFlour == goal;
    }
}
