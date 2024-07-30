import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("Welcome to Inventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. List Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:

                    ElectronicsItem.inputFields(scanner,inventory);
                    break;
                case 2:
                    ElectronicsItem.removeField(scanner,inventory);
                    break;
                case 3:
                    inventory.listItems();
                    break;
                case 4:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
