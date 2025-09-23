package oop;

public class Triangulo {
    public String nome;
    public double lado1;
    public double lado2;
    public double lado3;

    public double caclularArea()
    {
        double area =( lado1+ lado2 + lado3) / 2 ;
        System.out.println("Triangle " + nome + " area: " + area);
        return area;
    }


}
