package aulas.array_exercise.aplication.exerciciosIF.entities;

import java.util.Date;

public class Pessoa {
    private String name;
    private double peso;
    private double altura;
    private String dataNascimento;


    public Pessoa(String name, double peso, double altura) {
        this.name = name;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String name, double peso, double altura, String dataNascimento) {
        this.name = name;
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
