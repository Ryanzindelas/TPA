package prjDupla3lacos;

import java.util.Scanner;

public class IdadeUsuario {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int idade, anoAtual, anoNasc, i;
	
	i=0;
	
	do{
		
		System.out.println("digite seu ano de nascimento: ");
		anoNasc = ler.nextInt();
		
		System.out.println("digite o ano atual: ");
		anoAtual = ler.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println("sua Idade é: "+idade);
		
		System.out.println("deseja continuar? 0-sim 1-não ");
		i = ler.nextInt();
	} while(i == 0);
	
	System.out.println("programa finalizado.");
	
	
	
	
	ler.close();

	}

}
