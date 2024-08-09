package InventoryManagement;

public class Supplier {
    private String supplierId;
    private String name;

    public Supplier(String supplierId, String name) {
        this.supplierId = supplierId;
        this.name = name;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("InventoryManagement.Supplier ID: " + supplierId + ", Name: " + name);
    }
}