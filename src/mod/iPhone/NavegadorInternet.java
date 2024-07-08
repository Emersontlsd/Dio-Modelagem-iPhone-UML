package mod.iPhone;

public class NavegadorInternet extends iPhone{
    public NavegadorInternet(String modelo, String cor, String proprietario) {
        super(modelo, cor, proprietario);
    }

    public void exibirPagina(String url) {
        System.out.println("Acessando o site: " + url);
    }

    public void adicionarAba() {
        System.out.println("Abrindo nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Recarregando a página...");
    }
}
