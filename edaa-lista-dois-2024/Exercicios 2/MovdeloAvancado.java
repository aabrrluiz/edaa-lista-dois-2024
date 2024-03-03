import java.util.ArrayList;
import java.util.List;

public class MovdeloAvancado implements Celular {

    private List<String> historicoLigacoes = new ArrayList<>();
    private List<String> historicoMensagens = new ArrayList<>();

    @Override
    public void ligar() {
        System.out.println("\n \nSeja Bem vindo");
    }

    @Override
    public void desligar() {
        System.out.println("\nAté mais");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("\nLigando: " + numero);
        historicoLigacoes.add(numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("\nEnviar mensagem para: " + numero + "\nMensagem" + mensagem);
        historicoMensagens.add(mensagem);
    }

     public void todasligacoes(){
        System.out.println("\nHistorico Ligações");
        for (String ligacoes : historicoLigacoes){
        System.out.println(" -" + ligacoes);
        }
     }

     public void todasmensagens(){
        System.out.println("\nHistorico Mensagens");
        for( String mensagens : historicoMensagens){
            System.out.println(" - " + mensagens);
        }

     }

}