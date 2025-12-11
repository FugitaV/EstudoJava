package DesafioModulo1;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nomePessoa, double pesoPessoa){
		 this.nome = nomePessoa;
		 this.peso = pesoPessoa;
	}
	
	public void comer(Comida... comidas) {
	    for (Comida comida : comidas) {
	        if (comida != null) {
	            this.peso += comida.valorKj;
	        }
	    }
	}
}
