public class Main {
    public static void main(String[] args){
        int number = 0;
        int evenNumberCount = 0;
        while(number <= 100)
        {
            if(isEvenNumber(number)) {
                evenNumberCount++;
                System.out.println(number + " is even");
            }
            number++;

            if(evenNumberCount == 5) {
                break;
            }
        }

        System.out.println("Found " + evenNumberCount + " even numbers.");
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }

        return false;
    }
}
