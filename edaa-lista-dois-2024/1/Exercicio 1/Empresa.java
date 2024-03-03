
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<Funcionario>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario j) {
        this.funcionarios.add(j);
    }

    public void remFuncionario(Funcionario j) {
        this.funcionarios.remove(j);
    }

  public String toString() {
    String frase = this.nome + "\n";
    frase = frase + "Número de Funcionarios: " + this.funcionarios.size() + "\n\n";

    for(Funcionario j: this.funcionarios) {
      frase = frase + j + "\n";
    }
    
    return frase;
  }
}