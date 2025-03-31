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
		
<<<<<<< HEAD
		iphone.selecionarMusica("So Far Away - Avenged Sevenfold" );
=======
		iphone.selecionarMusica("So Far Away - Avenged Sevenfold");
>>>>>>> 3f7c103590cf53465547b3ca1a1c8357b43d0cc7
		iphone.tocar();
		iphone.pausar();

	}

}
