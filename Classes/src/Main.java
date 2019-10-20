public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");

        System.out.println(porsche.getModel());

        porsche.setModel("911");
        System.out.println(porsche.getModel());
    }
}
