import java.time.LocalDate;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){
        this.id= 0;
        this.balance = 0.0;
        this.dateCreated = new Date();
    }
    public Account(int id,double balance){
        this.id =id;
        this.balance=balance;
        this.dateCreated = new Date();
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double air){
        annualInterestRate = air;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate/12/100;
    }
    public double getMonthlyInterest() {
        return this.getMonthlyInterestRate()*balance;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }


}

