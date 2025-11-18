package prj15atividadesVetor;

import java.util.Scanner;

public class Ex4_paresA {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
    	
    	final int TAM = 10;
		
		int a[], i ,j;
		
		a = new int [TAM];
		
		//FOR do vetor
        for (i = 0; i<TAM; i++) {
        	System.out.println("Digite o valor do vetor A");
        	a[i] = ler.nextInt();
            System.out.print("Pares até " + a[i] + ": ");

            //FOR do calculo, se o segundo contador(j) for menor que o numero, ele vai aumentar e checar se é divisivel por 2(se for = par)
            for (j = 0;j <= a[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                    
                }
            }
            System.out.println(" ");

            
        }
	}
}
