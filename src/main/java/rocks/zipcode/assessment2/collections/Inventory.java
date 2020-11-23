package rocks.zipcode.assessment2.collections;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

private Map<String,Integer> inventory;
private List<String> strings;


    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            inventory.put(strings.get(i),0);
       }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

        this.inventory=new HashMap<>();
        //this(strings);

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {


   //     inventory.put(item,1);
      Integer temp=0;
      for (Map.Entry<String,Integer> keyValue: inventory.entrySet())
     {
        if(keyValue.getKey().equalsIgnoreCase(item)) {
              temp = keyValue.getValue() + 1;
              inventory.put(item,temp);
          }
        else
             inventory.put(item,temp);
       }

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer temp=0;
        for (Map.Entry<String,Integer> keyValue: inventory.entrySet())
        {
            if(keyValue.getKey().equalsIgnoreCase(item)) {
              temp = keyValue.getValue();
               // inventory.put(item,temp);
            }
        }

        return temp;
    }
}
