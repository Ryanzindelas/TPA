package prjLacosFaca;

import java.util.Scanner;

public class exponenciacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int expoente, base,r,i=1 ;
		
		System.out.println("digite o numero: ");
		base = ler.nextInt();
		System.out.println("digite o expoente: ");
		expoente = ler.nextInt();
		
		
		r=base;
		
		if(expoente!= 0) {
			do {
			
			base = (base*r) ;
					
			i++;
			
			
		}while (expoente>i);
			System.out.println(base);
		}else {
			System.out.println("1");
		};
		
		
		
		ler.close();
		}


	}


