package util;

import java.util.Scanner;

public class CurrencyConverter {
    public double calcularPrecoReais(double dolarPrice, double dolar) {
        double reais = dolarPrice * dolar;
        double percent = 0.06 *reais;
        double realTax = reais + percent;
        System.out.println("Amount to be paid in reais: "+ realTax );
        return reais;
    }
}
