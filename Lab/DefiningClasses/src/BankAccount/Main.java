package BankAccount;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Set<BankAccount> accounts = new HashSet<BankAccount>();

        while (!command.equals("Ens")){
            String[] tokens = command.split("\\s+");

            switch (tokens[0]){
                case "Create":
                    BankAccount account = new BankAccount();
                    System.out.println(String.format("Account ID%d created", account.getID()));
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (accounts.contains(account.getID())){

                    }
                    break;
                case "SetInterest":

                    break;
                case "Getinterest":

                    break;
            }


            command = scanner.nextLine();
        }

    }
}
