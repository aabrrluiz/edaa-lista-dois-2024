public class Funcionario {
    public static short id;
    public String nome;
    public String cargo;


    public Funcionario(short id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

   public short getId() {
       return id;

   }
   public void setId(short id) {
       this.id = id;
   }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    
    public String toString() {
        return (this.id+" - "+this.nome+" ("+this.cargo+")");
    }
}