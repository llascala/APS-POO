package banco;

public class ContaEspecial extends ContaCorrente {

    protected String nomeGerente;

    //Construtores
    
    public ContaEspecial() {
        super(0, null, 0);
    }

    public ContaEspecial(int numeroConta, String nomeCliente, int CPF, String nomeGerente) {
        super(numeroConta, nomeCliente, CPF);
        this.nomeGerente = nomeGerente;
    }

    public ContaEspecial(String nomeGerente, int numeroConta, String nomeCliente, int CPF, double Limite) {
        super(numeroConta, nomeCliente, CPF, Limite);
        this.nomeGerente = nomeGerente;
    }

    //Get e Set
    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    //Metodos
    @Override
    public String Imprimir() {
        return super.Imprimir() + "\nNome do Gerente Responsável: " + nomeGerente;
    }
}
