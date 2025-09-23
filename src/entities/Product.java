package entities;

import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValueInStock() {
        double total = price * quantity;
        return total;
    }

    public void dataOfProducts() {
        System.out.println("Product data: " + name + ", $" + price + ", " + quantity + ", Total: $ " + totalValueInStock());
    }

    public void addProductInStock() {
        System.out.println("Enter the number of product to be add in stock:");
        int added = scanner.nextInt();
        this.quantity += added;
    }

    public void removeProducts() {
        System.out.println("Enter the number of product to be removed from the stock:");
        int removed = scanner.nextInt();
        this.quantity -= removed;
    }

}

