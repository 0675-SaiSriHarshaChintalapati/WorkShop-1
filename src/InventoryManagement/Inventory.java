package InventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String itemId) {
    boolean found=false;
        for (int i = 0; i < items.size(); i++) {
             {
                if (items.get(i).getItemId().equals(itemId)) {
                    items.remove(i);
                    i--;
                    found =true;
                }
            }
            if(!found){
                System.out.println("InventoryManagement.Item not found");
            }
        }


    }

    public void listItems() {
        for (Item item : items) {
            item.displayDetails();
        }
    }

    }
