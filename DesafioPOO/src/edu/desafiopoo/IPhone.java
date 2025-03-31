package edu.desafiopoo;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	@Override
	public void exibirpagina(String url) {
		System.out.println("Exibindo o site de url: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba a janela atual. ");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página. ");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música selecionada. ");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música atual. ");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando seguinte música: " + musica);
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para seguinte número: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação. ");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz. ");
		
	}
	
}
