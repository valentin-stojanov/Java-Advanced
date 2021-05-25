package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = Integer.parseInt(scanner.nextLine());

        if (decimalNumber != 0) {
            ArrayDeque<Integer> binaryRepresentation = new ArrayDeque<>();

            while (decimalNumber != 0){
                binaryRepresentation.push(decimalNumber%2);
                decimalNumber /= 2;
            }
            for (Integer digit : binaryRepresentation) {
                System.out.print(digit);
            }
        } else {
            System.out.println(0);
        }
    }
}
