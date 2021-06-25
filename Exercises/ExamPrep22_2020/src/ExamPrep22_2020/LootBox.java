package ExamPrep22_2020;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LootBox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ArrayDeque<Integer> firstBox = new ArrayDeque<>();


        ArrayDeque<Integer> firstBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();

        for (int number : secondArr) {
            secondBox.push(number);
        }


        int loot = 0;

        while (!firstBox.isEmpty() && !secondBox.isEmpty()) {
            int secondBoxElement = secondBox.pop();
            int firstBoxElement = firstBox.peek();
            int sum = firstBoxElement + secondBoxElement;
            if (sum % 2 == 0){
                loot += sum;
                firstBox.poll();
            }else {
                firstBox.offer(secondBoxElement);
            }

        }

        if (firstBox.isEmpty()) {
            System.out.println("First lootbox is empty");
        }
        if (secondBox.isEmpty()) {
            System.out.println("Second lootbox is empty");
        }

        if (loot >= 100) {
            System.out.printf("Your loot was epic! Value: %d", loot);
        } else {
            System.out.printf("Your loot was poor... Value: %d", loot);
        }
    }
}
