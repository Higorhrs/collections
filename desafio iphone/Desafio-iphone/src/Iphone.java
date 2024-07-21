import iphone.internet.NavegadorInternet;
import iphone.musica.ReprodutorMusical;
import iphone.telefone.AparelhoTelefonico;

public class Iphone {
	 public static void main(String[] args) {
		 NavegadorInternet navegador = new NavegadorInternet();
		 	navegador.adicionarNovaAba();
		 	navegador.atualizarPagina();
		 	navegador.exibirPagina();
		 	
		 ReprodutorMusical reprodutor = new ReprodutorMusical();
		 reprodutor.pausar();
		 reprodutor.selecionarMusica();
		 reprodutor.tocar();
		 
		 AparelhoTelefonico telefone = new AparelhoTelefonico();
		 telefone.atender();
		 telefone.iniciarCorreioDeVoz();
		 telefone.ligar();
}
	 
	 
}