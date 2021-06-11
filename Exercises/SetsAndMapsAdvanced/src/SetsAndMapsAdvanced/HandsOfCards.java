package SetsAndMapsAdvanced;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> peopleCards = new LinkedHashMap<>();
        String command = scanner.nextLine();
        Map<Character, Integer> cardValueAndMultipliers = Map.of(
                'J', 11,
                'Q', 12,
                'K', 13,
                'A', 14,
                'S', 4,
                'H', 3,
                'D', 2,
                'C', 1
        );

        while (!command.equals("JOKER")){
            String[] tokens = command.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(", ");

            peopleCards.putIfAbsent(name, new HashSet<>());
            peopleCards.get(name).addAll(Arrays.asList(cards));

            command = scanner.nextLine();
        }

        peopleCards.forEach((people, deck) -> System.out.println(people +": "+ getSumOfDeck(deck, cardValueAndMultipliers)));
    }

    private static int getSumOfDeck(Set<String> deck, Map<Character, Integer> mapWithValues) {
        int sum = 0;
        for (String card : deck) {
            int currentCardValue =1;
            char firstChar = card.charAt(0);
            char secondChar = card.charAt(card.length()-1);

            if (Character.isDigit(firstChar)){
                if (firstChar == '1') {
                    currentCardValue *= 10;
                }else{
                    currentCardValue *= firstChar - '0';
                }
            }else {
                currentCardValue *= mapWithValues.get(firstChar);
            }
            currentCardValue *= mapWithValues.get(secondChar);
            sum += currentCardValue;
        }

        return sum;
    }
}
