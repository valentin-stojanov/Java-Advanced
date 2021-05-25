package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> kids = new ArrayDeque<>();
        for (String child : children) {
            kids.offer(child);
        }
        int cycle = 1;
        while (kids.size() > 1) {

            for (int i = 1; i < n; i++) {
                kids.offer(kids.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + kids.peek());
            } else {
                String removedKid = kids.poll();
                System.out.println("Removed " + removedKid);
            }
            cycle++;
        }
        System.out.println("Last is " + kids.peek());
    }

    private static boolean isPrime(int n) {
        if (n < 2){
            return false;
        }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        return true;
    }
}
