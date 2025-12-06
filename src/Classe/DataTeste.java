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
		
		var d3 = new Data();
		var data3Formatada = d3.obterDataFormatada();
		System.out.println(data3Formatada);
		
		var d4 = new Data(10,04,2015);
		var data4Formatada = d4.obterDataFormatada();
		System.out.println(data4Formatada);
	}
}
