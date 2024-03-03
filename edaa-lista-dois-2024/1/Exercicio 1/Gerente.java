public class Gerente extends Funcionario{

    private double salarioBaseGerente;
    public Gerente(short id, String nome, String cargo, double salarioBaseDesenvolvedor) {
        super(id, nome, cargo);
        this.salarioBaseGerente = 1.694; 
    }
    public void setSalarioBaseGerente(double salarioBaseGerente) {
        this.salarioBaseGerente = salarioBaseGerente;
    }
    
    public double getSalarioBaseGerente() {
        return salarioBaseGerente;
    }

    
}
