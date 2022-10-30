
public class BankAccountTest {
    public static void main (String[] args){

        BankAccount account1 = new BankAccount(0.00, 0.00);
        BankAccount account2 = new BankAccount(1000, 1000);
        BankAccount account3 = new BankAccount(500, 500);
        BankAccount account4 = new BankAccount(0.00, 0.00);

        account1.makeDeposite(2000, "save");
        account2.makeWithdraw(500, "save");
        account3.makeWithdraw(500, "check");


        // account1.displayTotal();
        // account2.displayTotal();
        // account3.displayTotal();
    }
}