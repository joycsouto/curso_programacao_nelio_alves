package aplication;

import entities.Employee;

import java.util.Scanner;

public class IncreaseSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        employee.employeeInformation();
        employee.employeeMessage();
        System.out.println("Which percent to increase salary?");
        employee.increaseSalary(scanner.nextDouble());
        employee.employeeUpdatedMessage();
    }
}
