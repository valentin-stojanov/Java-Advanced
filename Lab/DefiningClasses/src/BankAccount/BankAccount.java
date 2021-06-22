package BankAccount;

public class BankAccount {
    private static double defaultInterestRate = 0.02;
    private static int idCount = 1;

    private final int ID;
    private double balance;
    private double interestRate = defaultInterestRate;

    public BankAccount(){
        this.ID = idCount;
        idCount++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.setInterestRate(interestRate);
    }

       public int getID() {
        return ID;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
}
