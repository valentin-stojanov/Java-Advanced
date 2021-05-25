package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> kids = new ArrayDeque<>();
        for (String child : children) {
            kids.offer(child);
        }

        while (kids.size() > 1){

            for (int i = 1; i < n; i++) {
                kids.offer(kids.poll());
            }
            String removedKid = kids.poll();
            System.out.println("Removed "+removedKid);
        }
        System.out.println("Last is "+kids.peek());
    }
}
