package appheranca;

public class Funcionario {
    
    private String nome;
    private double salario;

    public Funcionario() {
        System.out.println("vazio funcionario");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        System.out.println("completo f");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String imprimir() {
        return "Nome: " + nome +
                "\nSalario: " + salario;
    }
    
    public void aumentarSalario(double porcentagem) {
        salario = salario + 
                (salario*porcentagem)/100;
    }
    
}