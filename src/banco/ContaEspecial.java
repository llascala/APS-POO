package banco;

public class ContaEspecial extends ContaCorrente {
	
	private String nomeGerente;
	
	//Construtores
	
	public ContaEspecial(int numeroConta, String nomeCliente, int CPF, String nomeGerente) {
		super(numeroConta, nomeCliente, CPF);
		this.nomeGerente = nomeCliente;
	}
	
	public ContaEspecial(int numeroConta, String nomeCliente, int CPF, String nomeGerente, double Limite) {
		super(numeroConta, nomeCliente, CPF, Limite);
		this.nomeGerente = nomeCliente;
	}
	
	//Get e Set
	
	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
	
	//Metodos
	
	public String Imprimir() {
		return super.Imprimir() + "\nNome do Gerente Responsável: " + nomeGerente;
	}
	
}
