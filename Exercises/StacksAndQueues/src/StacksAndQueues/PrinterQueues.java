package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String fileName = scanner.nextLine();

        while (!fileName.equals("print")) {
            if (fileName.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(fileName);
            }

            fileName = scanner.nextLine();
        }

        for (String name : printerQueue) {
            System.out.println(name);
        }
    }
}
