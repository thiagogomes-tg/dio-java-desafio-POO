package edu.desafiopoo;

public class Principal {

	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		iphone.exibirpagina("github.com");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
		System.out.println("");
		
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.ligar("(47) 99999-9999");
		System.out.println("");
		
		iphone.selecionarMusica("So Far Away - Avenged Sevenfold ");
		iphone.tocar();
		iphone.pausar();

	}

}
