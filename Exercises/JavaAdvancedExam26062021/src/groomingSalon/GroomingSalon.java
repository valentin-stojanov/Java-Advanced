package groomingSalon;

import java.util.*;
import java.util.stream.Collectors;

public class GroomingSalon {
    private int capacity;
    public List<Pet> data;

    public GroomingSalon(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet) {
        if (this.data.size() < capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String petName) {
        boolean containsPet = false;
        for (int i = 0; i < this.data.size(); i++) {
            if (data.get(i).getName().equals(petName)) {
                containsPet = true;
                data.remove(i);

            }
        }

        return containsPet;
    }

    public Pet getPet(String name, String owner) {
        for (int i = 0; i < this.data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                return data.get(i);

            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        return String.format("The grooming salon has the following clients:%n%s",
                this.data.stream()
                .map(e -> e.getName() + " " + e.getOwner())
                .collect(Collectors.joining(System.lineSeparator())));
//
//                this.data.
//                        .stream()
//                        .map(e -> e.getKey() + " " + e.getValue().getOwner())
//                        .collect(Collectors.joining(System.lineSeparator()))
//        ).trim();
    }
}
