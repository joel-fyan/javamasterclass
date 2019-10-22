public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    private static final double defaultCreditLimit = 1000d;

    public VipCustomer(String name, String emailAddress) {
        this(name, defaultCreditLimit, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer() {
        this("First Last", defaultCreditLimit, "first.last@domain.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
