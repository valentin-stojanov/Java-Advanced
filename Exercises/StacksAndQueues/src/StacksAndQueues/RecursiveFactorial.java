package StacksAndQueues;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(fact(n));
    }

    public static int fact (int n){
        if (n <1){
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
}
