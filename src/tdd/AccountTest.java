package tdd;
 import org.testng.annotations.Test;

 import static org.testng.AssertJUnit.assertEquals;

public class AccountTest {
    @Test
    public void depositTest() {
        // given that i have an account
        Account oziggyAccount = new Account();
        // when i deposit 5000
        oziggyAccount.deposit(5000);
        oziggyAccount.deposit(8000);
        // given that i withdraw 5000
        oziggyAccount.withdraw(5000);
        //check my balance
        int oziggyAccountBalance = oziggyAccount.getDeposit();
        assertEquals(8000, oziggyAccountBalance);
    }

    @Test
    public void withdrawalTest() {
        // given that I have an account
        Account ozzigyAcount = new Account();
        // given that i have 13000 in my account(13000);
        ozzigyAcount.deposit(20000);
        ozzigyAcount.deposit(20000);
        // when I want to withdraw 10000
        ozzigyAcount.withdraw(10000);
        ozzigyAcount.deposit(20000);
        // check my balance
        int oziggyAccountBalance = ozzigyAcount.getwithdraw();
        assertEquals(50000, oziggyAccountBalance);

    }
}