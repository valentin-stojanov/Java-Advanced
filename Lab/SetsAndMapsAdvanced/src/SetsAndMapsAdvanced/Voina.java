package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstDeck = readDeck(scanner);
        LinkedHashSet<Integer> secondDeck = readDeck(scanner);

        int rounds = 50;
        while (0 < rounds--){
            if (firstDeck.isEmpty() || secondDeck.isEmpty()){
                break;
            }
            int firstPlayerCard = gerFirstCard(firstDeck);
            int secondPlayerCard = gerFirstCard(secondDeck);

            firstDeck.remove(firstPlayerCard);
            secondDeck.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard){
                firstDeck.add(firstPlayerCard);
                firstDeck.add(secondPlayerCard);
            }else if (secondPlayerCard >firstPlayerCard){
                secondDeck.add(firstPlayerCard);
                secondDeck.add(secondPlayerCard);
            }
        }
        if (firstDeck.size() > secondDeck.size()){
            System.out.println("First player win!");
        }else if (secondDeck.size() > firstDeck.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw");
        }
    }

    private static int gerFirstCard(LinkedHashSet<Integer> deck) {
        int firstCard = 0;
        for (Integer card : deck) {
            firstCard = card;
            break;
        }
        return firstCard;
    }

    private static LinkedHashSet<Integer> readDeck(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }


}
