public class Suporte extends Funcionario{
    private double salarioBaseSuporte;

    public Suporte(short id, String nome, String cargo, double salarioBaseSuporte) {
        super(id, nome, cargo);
        this.salarioBaseSuporte = 1.482;
    }
    
    public void setSalarioBaseSuporte(double salarioBaseSuporte) {
        this.salarioBaseSuporte = salarioBaseSuporte;
    }

    public double getSalarioBaseSuporte() {
        return salarioBaseSuporte;
    }
}
