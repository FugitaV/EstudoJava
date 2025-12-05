package Classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2001;
		d1.dia = 26;
		d1.mes = 05;
		var data1Formatada = d1.obterDataFormatada();
		System.out.println(data1Formatada);
	
		var d2 = new Data();
		d2.ano = 2025;
		d2.dia = 10;
		d2.mes = 06;
		var data2Formatada = d2.obterDataFormatada();
		System.out.println(data2Formatada);
	}
}
