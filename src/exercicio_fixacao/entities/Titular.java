package exercicio_fixacao.entities;

public class Titular {
    private String name;
    private  int numeroConta;
    private double saldo;


    public Titular(int numeroConta, String name) {
        this.numeroConta = numeroConta;
        this.name = name;
    }

    public Titular(String name, int numeroConta, double valorDepositoInicial) {
        this.name = name;
        this.numeroConta = numeroConta;
        depositar(valorDepositoInicial);
    }

    public Titular() {

    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5; // taxa de 5 reais
    }

    @Override
    public String toString() {
        return "Dados Bancários {" +
                "name='" + name + '\'' +
                ", numeroConta=" + numeroConta +
                ", valorDeposito=" + saldo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }


}
