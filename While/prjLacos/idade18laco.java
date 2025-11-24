package prjLacos;

import java.util.Scanner;

public class idade18laco {

	public static void main(String[] args) {
	
		int i=1, j, maior18=0, menor18=0;
	
		Scanner ler = new Scanner(System.in);
	
		while(i<=5) {
			System.out.println("escreva idade da pessoa "+i);
			j = ler.nextInt();
					if(j>=18) {
						maior18++;
					} else {
						menor18++;
					}
				
					i++;
		}
		System.out.println(maior18+" são maiores de idade");
		System.out.println(menor18+" são menores de idade");
		ler.close();
	}

}
