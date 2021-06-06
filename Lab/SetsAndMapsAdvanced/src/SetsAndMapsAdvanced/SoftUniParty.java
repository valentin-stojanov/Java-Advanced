package SetsAndMapsAdvanced;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guest = scanner.nextLine();
        TreeSet<String> vipGuests = new TreeSet<>();
        TreeSet<String> regularGuests = new TreeSet<>();

        while (!guest.equals("PARTY")) {

            if (isVIPguest(guest)) {
                vipGuests.add(guest);
            } else {
                regularGuests.add(guest);
            }

            guest = scanner.nextLine();
        }

        guest = scanner.nextLine();

        while (!guest.equals("END")) {

            if (isVIPguest(guest)) {
                vipGuests.remove(guest);
            } else {
                regularGuests.remove(guest);
            }

            guest = scanner.nextLine();
        }

        System.out.println(vipGuests.size() + regularGuests.size());

        if (!vipGuests.isEmpty()) {
//            vipGuests.forEach(System.out::println);
            System.out.println(String.join(System.lineSeparator(), vipGuests));
        }
        if (!regularGuests.isEmpty()){
//            regularGuests.forEach(System.out::println);
            System.out.println(String.join(System.lineSeparator(), regularGuests));
        }
    }

    private static boolean isVIPguest(String guest) {
        return Character.isDigit(guest.charAt(0));
    }
}
