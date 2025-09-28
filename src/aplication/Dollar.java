package aplication;

import util.CurrencyConverter;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollar = scanner.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollarAmount = scanner.nextDouble();
        currencyConverter.calcularPrecoReais(dollar,dollarAmount);
    }
}
