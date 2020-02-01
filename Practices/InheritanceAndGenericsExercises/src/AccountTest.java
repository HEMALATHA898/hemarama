/**
 * This program tests the BankAccount class and
 * their subclasses.
 */
public class AccountTest {
    public static void main(String[] args) {
/**
 * An account that earns interest at a fixed rate.
 */
        SavingsAccount momsSavings
                = new SavingsAccount(0.5);

        CheckingAccount harrysChecking
                = new CheckingAccount(100);


        // This is Polymorphism. deposit method is overrided from BankAccount class in SavingsAccount
        momsSavings.deposit(10000);

        // This is Polymorphism. transfer method is overrided from BankAccount class in SavingsAccount
        momsSavings.transfer(harrysChecking, 2000);

        // This is Polymorphism. withdraw method is overrided from BankAccount class in CheckingAccount
        harrysChecking.withdraw(1500);
        // This is Polymorphism. withdraw method is overrided from BankAccount class in CheckingAccount
        harrysChecking.withdraw(80);

        // This is Polymorphism. transfer method is overrided from BankAccount class in SavingsAccount
        momsSavings.transfer(harrysChecking, 1000);
        // This is Polymorphism.  withdraw method is overrided from BankAccount class in CheckingAccount
        harrysChecking.withdraw(400);

        // not a polymorphism. addInterest method is SavingsAccount class method
        momsSavings.addInterest();
        // not a polymorphism. addInterest method is CheckingAccount class method
        harrysChecking.deductFees();

        System.out.println("Mom's savings balance = $"
                + momsSavings.getBalance());

        System.out.println("Harry's checking balance = $"
                + harrysChecking.getBalance());
    }
}