package aulas;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int n = scanner.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
            soma += array[i];
        }
        System.out.printf(" %.2f%n", soma/n);
    }
}
