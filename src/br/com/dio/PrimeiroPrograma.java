package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		gato gato = new gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
	}

}

class Livro {
	private String nome;
	private Integer npag;
}