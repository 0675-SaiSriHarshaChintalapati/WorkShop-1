package InventoryManagement;

import java.util.Scanner;

public class ElectronicsItem extends Item {
    private String warranty;

    public ElectronicsItem(String itemId, String name, int quantity, double price, String warranty) {
        super(itemId, name, quantity, price);
        this.warranty = warranty;
    }

    @Override
    public void displayDetails() {
        System.out.println("InventoryManagement.Item ID: " + getItemId() + ", Name: " + getName() +
                ", Quantity: " + getQuantity() + ", Price: " + getPrice() +
                ", Warranty: " + warranty);
    }
    static public void inputFields(Scanner scanner, Inventory inventory) {
        System.out.print("Enter item type (Electronics): ");
        String type = scanner.nextLine();

        System.out.print("Enter item ID: ");
        String itemId = scanner.nextLine();

        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        int price = scanner.nextInt();
        scanner.nextLine();

        if (type.equalsIgnoreCase("Electronics")) {
            System.out.print("Enter warranty: ");
            String warranty = scanner.nextLine();
            ElectronicsItem item = new ElectronicsItem(itemId, name, quantity, price, warranty);
            inventory.addItem(item);
        } else {
            System.out.println("Invalid item type.");
        }
    }
        static public  void removeField(Scanner scanner, Inventory inventory){
            System.out.print("Enter item ID to remove: ");
            String removeItemId = scanner.nextLine();
            inventory.removeItem(removeItemId);

        }
    }

