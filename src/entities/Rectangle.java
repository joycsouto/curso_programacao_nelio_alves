package entities;

import java.util.Scanner;

public class Rectangle {
    public double height;
    public double width;
    Scanner scanner = new Scanner(System.in);


    public double rectangleArea() {
        double area = height * width;
        return area;
    }

    public double rectanglePerimeter() {
        double perimeter = (height + width) * 2;
        return perimeter;
    }

    public double rectangleDiagonal(){
        double diagonal = height*height+width*width;
        return Math.sqrt(diagonal);

    }
    public void dataRectangle(){
        System.out.println("Enter rectangle width and height:");
        height = scanner.nextDouble();
        width = scanner.nextDouble();
    }
    public void calculatingRectangle(){
        System.out.println("AREA = " + rectangleArea());
        System.out.println("PERIMETER = " + rectanglePerimeter());
        System.out.println("DIAGONAL = " + rectangleDiagonal());
    }


}
