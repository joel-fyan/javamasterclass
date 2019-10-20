public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, 300d, "John Smth", "john.smith@gmail.com", "(505)555-1212");

        System.out.println("Account number = " + bankAccount.getAccountNumber());
        System.out.println("Balance = " + bankAccount.getBalance());
        System.out.println("Customer name = " + bankAccount.getCustomerName());
        System.out.println("Email = " + bankAccount.getCustomerEmail());
        System.out.println("Phone = " + bankAccount.getCustomerPhoneNumber());

        bankAccount.deposit(124.50);
        System.out.println("Balance = " + bankAccount.getBalance());

        bankAccount.withdraw(124.50);
        System.out.println("Balance = " + bankAccount.getBalance());

        bankAccount.withdraw(400);
        System.out.println("Balance = " + bankAccount.getBalance());
    }
}
