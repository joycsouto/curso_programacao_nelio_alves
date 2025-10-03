package aulas.array_exercise.aplication;

import java.util.Scanner;

public class Exercico1 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int[] arrayNumd = new int[2];
        for (int i = 0; i < arrayNumd.length; i++) {
            System.out.println("Digite um número:");
            arrayNumd[i] = scanner.nextInt();
        }

            if (arrayNumd[0] < arrayNumd[1]){
                System.out.println(arrayNumd[0]);
                System.out.println(arrayNumd[1]);
            }else {
                System.out.println(arrayNumd[1]);
                System.out.println(arrayNumd[0]);

        }
    }
}
