package oop;

import java.util.Scanner;

public class TrianguloTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo trianguloX = new Triangulo();
        Triangulo trianguloY = new Triangulo();
        System.out.println("Qual o nome do triangulo?");
        trianguloX.nome = scanner.next();
        System.out.println("Digite as medidas:");
        trianguloX.lado1 = scanner.nextDouble();
        trianguloX.lado2 = scanner.nextDouble();
        trianguloX.lado3 = scanner.nextDouble();

        System.out.println("Qual o nome do triangulo?");
        trianguloY.nome = scanner.next();
        System.out.println("Digite as medidas:");
        trianguloY.lado1 = scanner.nextDouble();
        trianguloY.lado2 = scanner.nextDouble();
        trianguloY.lado3 = scanner.nextDouble();
    //    trianguloX.caclularArea(trianguloX);
        //trianguloX.caclularArea(trianguloY);

        if  (trianguloX.caclularArea()> trianguloY.caclularArea()){
            System.out.println("O triangulo maior é o " + trianguloX.nome);
        }else System.out.println("O triangulo maior é o " + trianguloY.nome);
    }
}
