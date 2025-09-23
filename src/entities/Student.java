package entities;

import java.util.Scanner;

public class Student {
    public String name;
    public double grade1, grade2, grade3;
Scanner scanner = new Scanner(System.in);
    public void studentsInformation(){
        System.out.println("Name:");
        name = scanner.next();
        System.out.println("1° nota:");
        grade1 = scanner.nextDouble();
        System.out.println("2° nota:");
        grade2 = scanner.nextDouble();
        System.out.println("3° nota:");
        grade3 = scanner.nextDouble();
        MaxMinPoints();

    }
    public void MaxMinPoints() {
        if (grade1 > 30) {
            errorMessageMaxPoints();
            studentsInformation();
        }
        if (grade2 > 35) {
            errorMessageMaxPoints();
            studentsInformation();
        }
        if (grade3 > 35) {
            errorMessageMaxPoints();
            studentsInformation();
        }
        if (grade1 < 0) {
            errorMessageMinPoints();
            studentsInformation();
        }
        if (grade2 < 0) {
            errorMessageMinPoints();
            studentsInformation();
        }
        if (grade3 < 0) {
            errorMessageMinPoints();
            studentsInformation();
        }
    }
    public void errorMessageMaxPoints(){
        System.out.println("Sua nota precisa ter no máximo 35 pontos, digite novamente");
    }  public void errorMessageMinPoints(){
        System.out.println("Sua nota precisa ter no mínimo 0 pontos, digite novamente");
    }
    public void studentsPass(){
        double totalGrade = grade1+grade2+grade3;
        System.out.println("FINAL GRADE = " + totalGrade);
        if (totalGrade >= 0.60 * 100){
            System.out.println("PASS");
        }else if (totalGrade <  0.60 * 100 ){
            System.out.println("FAILED");
            System.out.println("MISSING " + ( 0.60 * 100 - totalGrade) + " POINTS");
        }

    }
}
