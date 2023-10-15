package builder2;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public Meal addItem(Item item) {
        items.add(item);
        return this;
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost+=item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.println(", Item: " + item.price());
        }
        System.out.println("Total= " + getCost());
    }
}
