package appheranca;

public class Gerente extends Funcionario {
    
    private int nFuncionarios;
    
    public Gerente(){
        System.out.println("vazio gerente");
    }
    
    public Gerente(String nome, double salario,
            int nFuncionarios) {
        super(nome, salario);
        this.nFuncionarios = nFuncionarios;
        System.out.println("completo g");
    }
    
    public String imprimir() {
        return super.imprimir() + 
                "\nNum. Funcionarios: " + 
                nFuncionarios;
    }

    public int getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }
    
    @Override
    public void aumentarSalario(double porcentagem) {
        super.aumentarSalario(porcentagem+20);
    }
    
    
    
}