package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo = "Minha Sogra fala demais.";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei.."+ euMesmo.segredo);
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDeCasal);
				
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja);
		
		Sogra sogrinha = new Sogra();
		//System.out.println(sogrinha.segredoDeFamilia);
		
	}
}
