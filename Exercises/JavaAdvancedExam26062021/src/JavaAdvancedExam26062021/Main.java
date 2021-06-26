package JavaAdvancedExam26062021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>();

        int[] intTasks = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int intTask : intTasks) {
            tasks.push(intTask);
        }

        ArrayDeque<Integer> threads = new ArrayDeque<>();

        int[] intThreads = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int intThread : intThreads) {
            threads.offer(intThread);
        }

        int taskToKill = Integer.parseInt(scanner.nextLine());

        int taskValue = 0 ;
        int threadValue =0 ;

        while (taskToKill != taskValue) {

            taskValue = tasks.peek();
            threadValue = threads.peek();

            if (threadValue >= taskValue) {
                tasks.poll();
                threads.pop();
            } else {
                threads.pop();
            }

//            if (taskToKill == taskValue){
//                break;
//            }
        }
        threads.push(threadValue);

        System.out.printf("Thread with value %d killed task %d%n",
                threadValue, taskToKill);

        threads.forEach( e-> System.out.print(e + " "));

    }
}
