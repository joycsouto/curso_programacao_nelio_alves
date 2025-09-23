package entities;

import java.util.Scanner;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    Scanner scanner = new Scanner(System.in);

    public void employeeInformation() {
        System.out.println("Name:");
        name = scanner.next();
        System.out.println("Gross salary:");
        grossSalary = scanner.nextDouble();
        System.out.println("Tax:");
        tax = scanner.nextDouble();
    }

    public void employeeMessage() {
        System.out.println("Employee:" + name + " , " + netSalary());
    }

    public double netSalary() {
        double netSalary = grossSalary - tax;
        return netSalary;
    }

    public void increaseSalary(double percentage) {
        double increase = grossSalary / percentage;
        double netSalary = grossSalary - tax;
        grossSalary = increase + netSalary;
    }

    public void employeeUpdatedMessage(){
        System.out.println("Updated data:" + name +" , " +grossSalary);
    }
}
