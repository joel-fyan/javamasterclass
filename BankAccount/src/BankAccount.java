public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this(1,0d,"Default Name","Default Email","Default Phone");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(999, 100, customerName, customerEmail, customerPhoneNumber);
    }

    public BankAccount(int accountNumber, double initialBalance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double amount) {
        if(amount >= 0)
        {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount >= this.balance) {
            return;
        }

        this.balance -= amount;
    }
}
