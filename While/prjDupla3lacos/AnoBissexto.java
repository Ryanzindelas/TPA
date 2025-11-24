package prjDupla3lacos;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
	int qntdd=0, anoBissexto=0, anoInicial, anoFinal;
	
	System.out.println("digite o ano inicial: ");
	anoInicial = ler.nextInt();
	
	System.out.println("digite o ano final: ");
	anoFinal = ler.nextInt();
	
	if(anoInicial > anoFinal) {
		System.out.println("erro");
	} else {
		while(anoBissexto <= anoInicial) {
			anoBissexto = anoBissexto+4;
		} 
		
		while (anoBissexto <= anoFinal){
			qntdd++;
			System.out.println("ano Bissexto n°"+qntdd+": "+anoBissexto);
			anoBissexto = anoBissexto +4;
		}
		
		System.out.println("nesse periodo tem: "+qntdd+" anos bissextos.");
		
		
	}
	
	ler.close();

	}

}
