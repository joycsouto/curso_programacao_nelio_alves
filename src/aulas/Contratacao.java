package aulas;

import java.util.Scanner;

public class Contratacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sim = 'n';


        System.out.println("Você deseja contratar Joyce?(s/n)");
        sim = scanner.next().charAt(0);

        while(sim != 's'){
            System.out.println("Você deseja contratar Joyce?(s/n)");
            sim = scanner.next().charAt(0);
     }
        System.out.println("Parabéns você esta contratada!");
    }
    }

