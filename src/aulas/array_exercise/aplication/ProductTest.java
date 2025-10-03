package aulas.array_exercise.aplication;

import aulas.array_exercise.entities.Product;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("How many products do you wanna put?");
        int quantity = scanner.nextInt();
        Product[] product = new Product[quantity];


        for (int i = 0; i < product.length; i++) {
            System.out.println("Enter the name and price:");
            String name = scanner.next();
            double price = scanner.nextDouble();
            product[i] = new Product(name, price);
            sum += product[i].getPrice();
        }
      double average = sum/product.length;
        System.out.printf("Average price = %.2f%n", average);
    }
}
