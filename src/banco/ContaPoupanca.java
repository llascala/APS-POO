package banco;

public class ContaPoupanca extends Conta {

    public void calculaRendimento(int porcentagemRendimento) {
        Saldo = (Saldo / porcentagemRendimento) + Saldo;
    }
}
