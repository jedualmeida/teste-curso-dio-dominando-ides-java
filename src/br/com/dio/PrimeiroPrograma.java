package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		gato gato = new gato();
		livros livros = new livros();
		
		System.out.println(gato);
		System.out.println(livros);
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World!" + (a+b));*/
		
	}

}

class livros {
	private String nome;
	private Integer npag;
}