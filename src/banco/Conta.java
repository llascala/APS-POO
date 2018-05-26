package banco;

public class Conta {

    private int numeroConta;
    private String nomeCliente;
    private int CPF;
    protected double Saldo;

    //Construtores
    public Conta() {
    }

    public Conta(int numeroConta, String nomeCliente, int CPF) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;

    }

    // Get's e Set's
    public int getNumeroConta() {
        return numeroConta;
    }

    protected void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCPF() {
        return CPF;
    }

    protected void setCPF(int cPF) {
        CPF = cPF;
    }

    public double getSaldo() {
        return Saldo;
    }

    protected void setSaldo(double saldo) {
        Saldo = saldo;
    }

    //Métodos
    public boolean sacar(int numeroConta, double valorSacado) {
        if (valorSacado > 0) {
            Saldo -= valorSacado;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            Saldo += valorDepositado;
            return true;
        } else {
            return false;
        }
    }

    public String Imprimir() {
        return "\nNome do Cliente: " + nomeCliente
                + "\nNumero da Conta: " + numeroConta
                + "\nCPF: " + CPF
                + "\nSaldo: " + Saldo + 
                "\n***************\n";
        
    }
}
