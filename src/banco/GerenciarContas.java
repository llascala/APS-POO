package banco;

import java.util.ArrayList;

public class GerenciarContas {

    private ArrayList<Conta> ArrayContas = new ArrayList<>();

    public void add(Conta g) {
        ArrayContas.add(g);
    }

    public boolean removerConta(int numeroConta) {
        for (int i = 0; i < ArrayContas.size(); i++) {
            if (ArrayContas.get(i).getNumeroConta() == numeroConta) {
                ArrayContas.remove(i);
                return true;
            }
        }
        return false;
    }

    public String buscarContasEspeciais(String nomeGerente) {
        String contasEspc = "";
        for (int i = 0; i < ArrayContas.size(); i++) {
            if(!nomeGerente.isEmpty()){
                contasEspc += ArrayContas.get(i).Imprimir();
                
             } 
        }
        return contasEspc;
    }

    public String buscarClientesUsandoLimite() {
        String clientesLimite = "";
        for (int i = 0; i < ArrayContas.size(); i++) {
            if (ArrayContas.get(i).getSaldo() < 0){
                clientesLimite += ArrayContas.get(i).Imprimir();
            }
        }
        return clientesLimite;
    }

    public Conta buscarConta(int numeroConta) {
        for (int i = 0; i < ArrayContas.size(); i++) {
            if (ArrayContas.get(i).getNumeroConta() == numeroConta) {
               return ArrayContas.get(i);
               
            } 
        }
        return null;
    }

    public boolean sacar(int numeroConta, double valorSacado) {
        for (int i = 0; i < ArrayContas.size(); i++) {
            if (ArrayContas.get(i).getNumeroConta() == numeroConta) {
                if (ArrayContas.get(i).getSaldo() > valorSacado) {
                    System.out.println("Seu saldo após o saque é: " + sacar(numeroConta, valorSacado));
                    return true;
                } else {
                    System.out.println("Essa quantia não pode ser sacada");
                }
            } else {
            }
        }
        return false;
    }

    public boolean depositar(int numeroConta, double valorDepositado) {
        for (int i = 0; i < ArrayContas.size(); i++) {
            if (ArrayContas.get(i).getNumeroConta() == numeroConta) {
                // Incrementar saldo
                System.out.println("Seu saldo após o depósito é: ");
                return true;
            }
        }
        return false;
    }

    public String listarConta() {
        String saida = "";
        for (int i = 0; i < ArrayContas.size(); i++) {
            saida += ArrayContas.get(i).Imprimir();
            saida += "\n***************\n";
        }
        return saida;
    }

}
