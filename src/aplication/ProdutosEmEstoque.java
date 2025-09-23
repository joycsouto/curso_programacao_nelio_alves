package aplication;

import entities.Product;

import java.util.Scanner;

public class ProdutosEmEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.println("Name: ");
        product.setName(scanner.next());
        System.out.println("Price: ");
        product.setPrice(scanner.nextDouble());
//        System.out.println("Quantity in stock: ");
//        product.quantity = scanner.nextInt();
        Product product1 = new Product(product.getName(), product.getPrice());
        product.totalValueInStock();
        product.dataOfProducts();
        product.addProductInStock();
        product.dataOfProducts();
        product.removeProducts();
        product.dataOfProducts();
    }
}
