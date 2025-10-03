package aulas.array_exercise.aplication;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
     Arrays.sort(array);
        for (int num : array){
            System.out.println(num);
        }

    }
}
