public class Main {
    public static void main(String[] args) {
        System.out.println(area(5.0)); // Expect 78.53975
        System.out.println(area(-1)); // Expect -1
        System.out.println(area(5.0, 4.0)); // Expect 20.0
        System.out.println(area(-1.0, 4.0)); // Expect -1
    }

    private static double area(double radius)
    {
        if(radius < 0)
        {
            return -1;
        }

        return Math.PI * radius * radius;
    }

    private static double area(double length, double width) {
        if(length < 0 || width < 0)
        {
            return -1;
        }

        return length * width;
    }
}
