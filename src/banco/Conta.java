package banco;

import java.util.ArrayList;

public abstract class Conta {
	
	private ArrayList<Conta> contasArray = new ArrayList<>();
	
	private int numeroConta;
	private String nomeCliente;
	private int CPF;
	protected double Saldo;
	
	//Construtores
	
	public Conta() {}
	
	public Conta(int numeroConta, String nomeCliente, int CPF) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.CPF = CPF;
	}
	
	// Get's e Set's

	public int getNumeroConta() {
		return numeroConta;
	}

	private void setNumeroConta(int numeroConta) {
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

	private void setCPF(int cPF) {
		CPF = cPF;
	}

	public double getSaldo() {
		return Saldo;
	}

	private void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	//Métodos
	
	public boolean sacar(int numeroConta ,double valorSacado) {
		for (int i = 0; i < contasArray.size();i++) {
			if (contasArray.get(i).getNumeroConta() == numeroConta) {
				Saldo -= valorSacado;
				return true;
			}
		}
		return false;
	}
	
	public boolean depositar(int numeroConta ,double valorDepositado) {
		for (int i = 0; i < contasArray.size();i++) {
			if (contasArray.get(i).getNumeroConta() == numeroConta) {
				Saldo += valorDepositado;
				return true;
			}
		}
		return false;
	}
	
	public String Imprimir() {
		return  "Nome do Cliente: " + nomeCliente +
				"\nNumero da Conta: " + numeroConta +
				"\nCPF: " + CPF +
				"\nSaldo: " + Saldo;
	}
	
}
