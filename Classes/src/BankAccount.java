public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    // setter methods
    public void setAccountNumber(String number) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.customerEmail = customerEmail;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getter methods
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber(String accountNumber) {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void deposit(int amount) {
        if (balance <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.println("Deposit of " + amount + " was made. New balance: " + balance);
        }
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Current balance: " + (balance));
        }
    }
}