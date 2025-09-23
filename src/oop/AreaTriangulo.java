package oop;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
double triangulox1,triangulox2,triangulox3,trianguloy1,trianguloy2,trianguloy3;
        System.out.println("Enter the measures of trinagle x");
        triangulox1 = scan.nextDouble();
        triangulox2 = scan.nextDouble();
        triangulox3 = scan.nextDouble();
        double areax = (triangulox1 +triangulox2+triangulox3) /2;
        System.out.println("Enter the measures of trinagle y");
        trianguloy1 = scan.nextDouble();
        trianguloy2 = scan.nextDouble();
        trianguloy3 = scan.nextDouble();
        double areay = (trianguloy1 +trianguloy2+trianguloy3) /2;
        System.out.println("Triangle X area:" + areax);
        System.out.println("Triangle Y area:" + areay);
        if (areay > areax){
            System.out.println("Larger area Y" );
        }else System.out.println("Larger area X");
}}
