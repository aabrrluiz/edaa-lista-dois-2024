public class Principal {
    public static void main(String[] args) {
        ModeloBasico celularBasico = new ModeloBasico();
        celularBasico.ligar();
        celularBasico.desligar();
        celularBasico.fazerLigacao("\n31982827171");
        celularBasico.enviarMensagem("\n31982827171", "Olá, tudo bem com você?");

          

        MovdeloAvancado celularAvancado = new MovdeloAvancado();
        celularAvancado.ligar();
        celularAvancado.desligar();
        celularAvancado.fazerLigacao("\n31982827171");
        celularBasico.enviarMensagem("\n31982827171", "Olá, tudo bem com você?");
        celularAvancado.todasligacoes();
        celularAvancado.todasmensagens();

    }

    
}
