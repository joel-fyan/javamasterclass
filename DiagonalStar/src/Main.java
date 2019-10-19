public class Main {
    public static void main(String[] args) {
        printSquareStar(5);
    }
    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for(int row = 1; row <= number; row++) {
            for(int col = 1; col <= number; col++) {
                if(col == 1 || col == number || row == 1 || row == number){
                    System.out.print("*");
                }
                else if(col == row) {
                    System.out.print("*");
                }
                else if(col == number - row + 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
