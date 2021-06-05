import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTester {
    @Test
    public void testBankAccount() {
        BankAccount bk = new BankAccount();
        bk.setCustomerName("Daniel Akinniranye");
        bk.setBalance(100);

        System.out.println(bk.getCustomerName());

        bk.withdraw(50);
        assertEquals(50, bk.getBalance());

        bk.deposit(104);
        assertEquals(154, bk.getBalance());
    }
}
