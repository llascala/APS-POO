package banco;

public class ContaCorrente extends Conta {
	
	private double Limite;
	
	//Construtores
	
	public ContaCorrente(int numeroConta, String nomeCliente, int CPF) {
		super(numeroConta, nomeCliente, CPF);
	}
	
	public ContaCorrente(int numeroConta, String nomeCliente, int CPF,double Limite){
		super(numeroConta, nomeCliente, CPF);
		this.Limite = Limite;
	}
	
	//Get e Set
	
	public double getLimite() {
		return Limite;
	}

	public void setLimite(double limite) {
		Limite = limite;
	}
	
	//Metodos
	
	public boolean usandoLimite() {
		if (Saldo < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean sacar(int numeroConta ,double valorSacado) {
		return super.sacar(numeroConta, valorSacado);
		//Considerar limite nesse ponto
	}
	
	@Override
	public String Imprimir() {
		return super.Imprimir() + "\nLimite: " + Limite;
	}
	
	
}