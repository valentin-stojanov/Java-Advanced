package StacksAndQueues;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] memoryForFib;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        memoryForFib = new long[n + 1];
        System.out.println(getFibonacciN(n));
    }

    private static long getFibonacciN(int n) {
        if (n <= 1) {
            return 1;
        }

        if (memoryForFib[n] != 0) {
            return memoryForFib[n];
        } else {
            return memoryForFib[n] = getFibonacciN(n - 1) + getFibonacciN(n - 2);
        }
    }
}
