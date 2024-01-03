package account;

/**
 * TestAccount
 */
public class TestAccount {

    public static void main(String[] args) {
        
        Account account1 = new Account();
        
        account1.insert(1, "Akin", 20000000);
        account1.display();
        account1.checkBalance();
        account1.deposit(400000);
        account1.checkBalance();
        account1.withdraw(15000);
        account1.checkBalance();
    }
}