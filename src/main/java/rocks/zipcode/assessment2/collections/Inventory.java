package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */

//Misleading header , spend time to create MAP but then used the ArrayList which was being passed in the constructor
public class Inventory {

    private List<String> inventory;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        inventory = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            inventory.add(strings.get(i));
        }

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inventory = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        inventory.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventory.remove(inventory.indexOf(item));
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer count = 0;
        for (int i = 0; i < inventory.size(); i++) {
            String s = inventory.get(i);
            if (s.equals(item)) {
                count++;
            }
        }
        return count;
    }
}