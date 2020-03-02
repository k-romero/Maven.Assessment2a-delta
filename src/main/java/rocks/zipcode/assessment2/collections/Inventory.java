package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    HashMap<String,Integer> inventory;
    ArrayList<String> itemList;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.itemList = new ArrayList<>(strings);
        this.inventory = new HashMap<>();
        for (String s : strings) {
            if(s != null){
                inventory.put(s,0);
            }
            else inventory.put("",0);

        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.itemList = new ArrayList<>();
        this.inventory = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(inventory.containsKey(item)){
            inventory.replace(item,inventory.get(item),inventory.get(item)+1);
        }else inventory.put(item,1);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventory.replace(item,inventory.get(item),inventory.get(item)-1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if(inventory.get(item) == null){
            return 0;
        } else
        return inventory.get(item);
    }
}
