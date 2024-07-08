package mod.iPhone;

public class ReprodutorMusical extends iPhone{

    public ReprodutorMusical( String modelo, String cor, String proprietario) {
        super(modelo, cor, proprietario);
    }

    public void tocar() {
        System.out.println("O iPhone: " + getModelo() +", " + getCor() + " de " + getProprietario() + " está Tocando Música...");
    }

    public void pausar() {
        System.out.println("Música Pausada...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música..." + musica);
    }
}
