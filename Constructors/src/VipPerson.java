public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;


    // default for all field
    public VipPerson() {
        this("John Doe", 2500.00, "default@email.com");
    }
    // default for the email
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
    }
    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
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
