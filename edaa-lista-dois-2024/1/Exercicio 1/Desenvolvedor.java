public class Desenvolvedor extends Funcionario{
    private double salarioBaseDesenvolvedor;

    public Desenvolvedor(int i, String nome, String cargo, double salarioBaseDesenvolvedor) {
        super((short)id, nome, cargo);
        this.salarioBaseDesenvolvedor = 1.553;
    }

    public void setSalarioBaseDesenvolvedor(double salarioBaseDesenvolvedor) {
        this.salarioBaseDesenvolvedor = salarioBaseDesenvolvedor;
    }

    public double getSalarioBaseDesenvolvedor() {
        return salarioBaseDesenvolvedor;
    }


}
