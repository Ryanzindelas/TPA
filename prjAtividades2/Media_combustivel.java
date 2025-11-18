package prjAtividades2;
import java.util.Scanner;

public class Media_combustivel {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int distancia, capacidadeTanque, gastoMedio;
		
		System.out.println("escreva a distancia percorrida:");
		distancia = ler.nextInt();
				
		System.out.println("escreva a capacidade, em litros, do tanque de combustivel:");
		capacidadeTanque = ler.nextInt();
		
	gastoMedio = distancia/capacidadeTanque;
	if (gastoMedio >= 10) {
		System.out.println("� economico.");
	} else {
		System.out.println("n�o � economico.");
	}
	System.out.println("o gasto m�dio do seu carro �: "+ gastoMedio);
	
	ler.close();	
		
	}
}
