public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario() {
        this.nome = "";
        this.salario = 0.0;
        this.cargo = "";
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}