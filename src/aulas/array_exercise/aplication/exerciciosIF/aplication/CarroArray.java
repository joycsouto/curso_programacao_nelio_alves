package aulas.array_exercise.aplication.exerciciosIF.aplication;

import aulas.array_exercise.aplication.exerciciosIF.Carro;

import java.util.Scanner;

public class CarroArray {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        Carro[] carros = new Carro[2];
        for (int i = 0; i < carros.length ; i++) {
            System.out.println("Marca:");
            String marca = scanner.next();
            System.out.println("Ano fabricação:");
            int anoF = scanner.nextInt();
            System.out.println("Ano do modelo:");
            int anoM = scanner.nextInt();
            System.out.println("Cor:");
            String cor = scanner.next();
            System.out.println("Preço:");
            double price = scanner.nextDouble();
            Carro carro = new Carro(marca,anoF,anoM,cor,price);
            System.out.println(carro);
        }
    }
}
