public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");

        System.out.println(porsche.getModel());

        porsche.setModel("911");
        System.out.println(porsche.getModel());

        System.out.println();
        System.out.println();
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("Name = " + vipCustomer.getName());
        System.out.println("Credit limit = " + String.format("%.2f", vipCustomer.getCreditLimit()));
        System.out.println("Email address = " + vipCustomer.getEmailAddress());

        System.out.println();
        System.out.println();
        VipCustomer anotherVipCustomer = new VipCustomer("Jane Doe", "jane.doe@gmail.com");
        System.out.println("Name = " + anotherVipCustomer.getName());
        System.out.println("Credit limit = " + String.format("%.2f", anotherVipCustomer.getCreditLimit()));
        System.out.println("Email address = " + anotherVipCustomer.getEmailAddress());

        System.out.println();
        System.out.println();
        VipCustomer yetAnotherVipCustomer = new VipCustomer("judy judy", 20000d, "judy.judy@gmail.com");
        System.out.println("Name = " + yetAnotherVipCustomer.getName());
        System.out.println("Credit limit = " + String.format("%.2f", yetAnotherVipCustomer.getCreditLimit()));
        System.out.println("Email address = " + yetAnotherVipCustomer.getEmailAddress());

        System.out.println();
        System.out.println();
        Wall wall = new Wall(5,4);
        System.out.println("area = " + String.format("%.2f", wall.getArea()));

        wall.setHeight(-1.5);
        System.out.println("width = " + String.format("%.2f", wall.getWidth()));
        System.out.println("height = " + String.format("%.2f", wall.getHeight()));
        System.out.println("area = " + String.format("%.2f", wall.getArea()));

        System.out.println();
        System.out.println();
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }
}
