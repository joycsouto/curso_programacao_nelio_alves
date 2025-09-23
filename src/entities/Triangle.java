package entities;

import util.Calculator;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        double circumference = Calculator.circumference(radius);
        double volume = Calculator.volume(radius);
        System.out.println("Circumference: %.2f%n" + circumference);
        System.out.println("Volume: %.2f%n" + volume);
        System.out.println("PI value: %.2f%n" + Calculator.PI);



}}
