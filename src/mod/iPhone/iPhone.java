package mod.iPhone;

public class iPhone {

    private String modelo = "14-Pro-Max";
    private String cor = "Roxo";
    private String proprietario = "Emerson Souza";

    public iPhone(String modelo, String cor, String proprietario) {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}
