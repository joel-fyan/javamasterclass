public class Main {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 1)); // Expect true because dog is barking and hour is in range
        System.out.println(BarkingDog.shouldWakeUp(false, 2)); // Expect false since dog is not barking
        System.out.println(BarkingDog.shouldWakeUp(true, 8)); // Expect false, since barking at 8
        System.out.println(BarkingDog.shouldWakeUp(true, -1)); // Expect false because out of range
    }
}
