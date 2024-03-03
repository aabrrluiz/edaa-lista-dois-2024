public class ModeloBasico implements Celular {

    @Override
    public void ligar() {
      System.out.println("\nSeja Bem vindo");
    }

    @Override
    public void desligar() {
        System.out.println("\nAté mais");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("\nLigando para: " + numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("\nEnviar mensagem para: " + numero + "\nMensagem: " + mensagem);
    }
    
}
