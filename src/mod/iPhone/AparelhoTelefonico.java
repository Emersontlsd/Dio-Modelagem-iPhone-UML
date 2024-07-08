package mod.iPhone;

public class AparelhoTelefonico extends iPhone{
    public AparelhoTelefonico(String modelo, String cor, String proprietario) {
        super(modelo, cor, proprietario);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a ligação recebida...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void finalizarLigacao(){
        System.out.println("Finalizando a ligação...");
    }
}
