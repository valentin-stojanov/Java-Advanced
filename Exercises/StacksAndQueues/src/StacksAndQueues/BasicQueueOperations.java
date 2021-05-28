package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (!queue.isEmpty()) {
            if (queue.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queue));
            }
        }else{
            System.out.println(0);
        }
    }
}
