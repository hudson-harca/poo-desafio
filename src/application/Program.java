package application;

import models.IPhone;

public class Program {

	public static void main(String[] args) {
		
		
		
		IPhone iphone = new IPhone();
		
		
		iphone.selecionarMusica("Música selecionada");
		
		iphone.tocar();

		iphone.pausar();

		iphone.adicionarNovaAba();

		iphone.exibirPagina("Página exibida");
		
		iphone.atualizarPagina();

		iphone.ligar("Ligação em andamento");

		iphone.atender();

		iphone.iniciarCorreioVoz();
		

	}

}
