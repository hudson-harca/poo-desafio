package models;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	public void tocar() {
		System.out.println("Tocando a Música");
	}

	public void pausar() {
		System.out.println("Pausando a Música");
		
	}

	public String selecionarMusica(String musica) {
		System.out.println(musica);
		return musica;
	}

	public String exibirPagina(String url) {
		System.out.println(url);
		return url;
	}

	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
	}

	public void atualizarPagina() {
		System.out.println("Página atualizada");	
	}

	public String ligar(String numero) {
		System.out.println(numero);
		return numero;
	}

	public void atender() {
		System.out.println("Atendendo a ligação");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz");
		
	}

}
