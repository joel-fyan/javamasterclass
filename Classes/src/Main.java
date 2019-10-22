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
    }
}
