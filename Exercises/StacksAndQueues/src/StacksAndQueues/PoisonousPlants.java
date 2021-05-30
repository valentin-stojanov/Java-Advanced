package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> plants = new ArrayDeque<>();
        for (int pesticideContent : input) {
            plants.push(pesticideContent);
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int dayCounter = 0;
        int oldPlantsSize = plants.size();
        while (true) {

            while (!plants.isEmpty()) {
                int rightPlant = plants.pop();
                if (plants.size() > 0) {
                    if (rightPlant <= plants.peek()) {
                        stack.push(rightPlant);
                    }
                } else {
                    stack.push(rightPlant);
                }
            }

            if (oldPlantsSize == stack.size()){
                break;
            }else {
                while (!stack.isEmpty()){
                    plants.push(stack.pop());
                }
                oldPlantsSize = plants.size();
            }
            dayCounter++;
        }
        if (dayCounter == 0){
            dayCounter = 1;
        }
        System.out.println(dayCounter);
    }
}
