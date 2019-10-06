public class Main {
    public static void main(String[] args){
        int number = 0;

        while(number <= 100)
        {
            if(isEvenNumber(number)) {
                System.out.println(number + " is even");
            }
            number++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }

        return false;
    }
}
