package appheranca;

import java.util.ArrayList;

public class GerenciarFuncionarios {
    
    private ArrayList<Funcionario> funcionarios = 
            new ArrayList<>();
    
    public void add(Funcionario f) {
        funcionarios.add(f);
    }
    
    public boolean removerFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).getNome().equals(nome)) {
                funcionarios.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public String listar() {
        String saida = "";
        for (int i = 0; i < funcionarios.size(); i++) {
            saida += funcionarios.get(i).imprimir();
            saida += "\n***************\n";
        }
        return saida;
    }
    
    public String listarSalario() {
        String saida = "";
        for (int i = 0; i < funcionarios.size(); i++) {
            //Funcionario f = funcionarios[i];
            Funcionario f = funcionarios.get(i);
            saida += f.getNome() + " " + f.getSalario() + "\n";
        }
        return saida;
    }
    
    public int contarGerentes() {
        int contador = 0;
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if(f instanceof Gerente) {
                contador++;
            }
        }
        return contador;
    }
    
    public String listarPorFaixaSalarial(double valorInicial,
            double valorFinal) {
        String saida = "";
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if(f.getSalario() >= valorInicial &&
                    f.getSalario() <= valorFinal) {
                saida += f.imprimir() + "\n";
            }
        }
        return saida;
    }
    
}