//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account A1 = new Account(1122,20000);
        A1.setAnnualInterestRate(4.5);

        A1.withdraw(2500);
        A1.deposit(3000);
        System.out.println("Balance: " + A1.getBalance());
        System.out.println("Monthly interest: " + A1.getMonthlyInterest());
        System.out.println("Date Created: " + A1.getDateCreated());

    }
}