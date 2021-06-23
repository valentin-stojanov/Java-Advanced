package BankAccount;

public class BankAccount {
    private static double defaultInterestRate = 0.02;
    private static int idCount = 1;

    private final int ID;
    private double balance;
    private static double interestRate = defaultInterestRate;

    public BankAccount(){
        this.ID = idCount;
        idCount++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

       public int getID() {
        return ID;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public static double getInterestRate(){
        return interestRate;
    }
}
