package exercicio_fixacao.aplication;

import exercicio_fixacao.entities.Titular;
import exercicio_fixacao.util.ServicosBancarios;

public class BancoTeste {
    public static void main(String[] args) {
        ServicosBancarios servicosBancarios = new ServicosBancarios();
        Titular titular = servicosBancarios.coletarDados();

        servicosBancarios.depositar(titular);
        servicosBancarios.sacar(titular);
    }
}
