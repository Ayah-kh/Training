package Builder4;

import java.util.ArrayList;
import java.util.List;

public class CDType {
    private List<Packing> items = new ArrayList<>();

    public void addItems(Packing packs) {
        items.add(packs);
    }

    public void getCost() {
        for (Packing packs : items) {
            packs.getPrice();
        }
    }

    public void showItems() {
        for (Packing packing : items) {
            System.out.print("CD name : " + packing.pack());
            System.out.println(", Price : " + packing.getPrice());
        }
    }
}
