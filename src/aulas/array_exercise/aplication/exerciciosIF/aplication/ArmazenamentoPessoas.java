package aulas.array_exercise.aplication.exerciciosIF.aplication;

import aulas.array_exercise.aplication.exerciciosIF.entities.Pessoa;

import java.util.Date;
import java.util.Scanner;

public class ArmazenamentoPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[2];
        String[] dataNascimentos = new String[2];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite seu nome:");
            String name = scanner.next();
            System.out.println("Digite seu peso:");
            double peso = scanner.nextDouble();
            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();
            System.out.println("Digite sua data de nascimento:");
            dataNascimentos[i] = scanner.next();
            Pessoa pessoa = new Pessoa(name,peso,altura,dataNascimentos[i]);
            System.out.println(pessoa);

        }

    }
}
