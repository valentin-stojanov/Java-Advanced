package BankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<Integer,BankAccount> accounts = new HashMap<Integer, BankAccount>();

        while (!command.equals("End")){
            String[] tokens = command.split("\\s+");

            switch (tokens[0]){
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getID(), account);
                    System.out.println(String.format("Account ID%d created", account.getID()));
                    break;
                case "Deposit": {
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (accounts.containsKey(id)) {
                        BankAccount account1 = accounts.get(id);
                        account1.deposit(amount);
                        System.out.println(String.format("Deposited %d to ID%d", amount, id));
                    } else {
                        System.out.println("Account does not exist");
                    }
                }
                break;
                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (accounts.containsKey(id)) {
                        double in = accounts.get(id).getBalance()*BankAccount.getInterestRate()*years;
                        System.out.printf("%.2f%n", in);
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
            command = scanner.nextLine();
        }

    }
}
