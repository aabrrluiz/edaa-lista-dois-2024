
public class Principal {
    public static void main(String[] args) {

        Empresa Solucoes = new Empresa("Soluções Tecnologicas");
        Desenvolvedor Pedro = new Desenvolvedor((short)1, "Pedro", "Deselvolvedor", 0);
        Gerente Andre = new Gerente((short) 2, "Andre", "Gerente", 0);
        Suporte Paiva = new Suporte((short) 3, "Paiva", "Suporte", 0);
        Solucoes.addFuncionario(Pedro);
        Solucoes.addFuncionario(Andre);
        Solucoes.addFuncionario(Paiva);
        System.out.println(Solucoes);

        System.out.println("\nFuncionario: " + Pedro.getNome() + "\nSeu salrio é: " + Pedro.getSalarioBaseDesenvolvedor());
        System.out.println("\nFuncionario: " + Andre.getNome() + "\nSeu salario é: " + Andre.getSalarioBaseGerente());
        System.out.println("\nFuncionario: " + Paiva.getNome() + "\nSeu salario é: " + Paiva.getSalarioBaseSuporte());

    }
    }

