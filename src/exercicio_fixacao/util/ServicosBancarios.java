package exercicio_fixacao.util;

import exercicio_fixacao.entities.Titular;

import java.util.Scanner;

public class ServicosBancarios {

    Scanner scanner = new Scanner(System.in);
    int numeroConta;
    String nomeTitular;
    double saldo;

    public Titular coletarDados() {
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Nome do titular: ");
        String nomeTitular = scanner.next();

        System.out.print("Você vai depositar? (s/n) ");
        char vaiDepositar = scanner.next().charAt(0);

        Titular titular;
        if (vaiDepositar == 's') {
            System.out.print("Qual o valor inicial do depósito? ");
            double saldoInicial = scanner.nextDouble();
            titular = new Titular(nomeTitular, numeroConta, saldoInicial);
            System.out.println(titular);
        } else {
            titular = new Titular(numeroConta, nomeTitular);
            System.out.println(titular);
        }
        return titular;
    }


    public void depositar(Titular titular) {
        System.out.println("Digite o valor de deposito:");
        double deposito = scanner.nextDouble();
        titular.depositar(deposito);
        System.out.println(titular);

    }

    public void sacar(Titular titular) {
        System.out.println("Digite o valor de saque:");
        double saque = scanner.nextDouble();
        titular.sacar(saque);
        System.out.println(titular);
    }

}
