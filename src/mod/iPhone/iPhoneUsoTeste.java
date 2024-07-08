package mod.iPhone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class iPhoneUsoTeste {
    public static void main(String[] args) {

        ReprodutorMusical iphone = new ReprodutorMusical("14-Pro-Max", "Roxo", "Emerson");
        System.out.println("Modelo: " + iphone.getModelo());
        System.out.println("Cor: " + iphone.getCor());
        System.out.println("Proprietário: " + iphone.getProprietario());
        System.out.println();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Moogzera - Illusionize");
        System.out.println();

        AparelhoTelefonico iphone1 = new AparelhoTelefonico ("14-Pro-Max", "Roxo", "Emerson");
        iphone1.ligar("11-99999-8888");
        iphone1.finalizarLigacao();
        iphone1.atender();
        iphone1.finalizarLigacao();
        iphone1.iniciarCorreioVoz();
        System.out.println();

        NavegadorInternet iphone2 = new NavegadorInternet("14-Pro-Max", "Roxo", "Emerson");
        iphone2.exibirPagina("www.youtube.com");
        iphone2.atualizarPagina();
        iphone2.adicionarAba();
        System.out.println();





    }// fim main
}// fim classe