package prj15atividadesVetor;

import java.util.Scanner;

public class Ex4_paresA {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
    	
    	final int TAM = 10;
		
		int a[], i ,ii;
		
		a = new int [TAM];
		

        for (i = 0; i<TAM; i++) {
        	System.out.println("Digite o valor do vetor A");
        	a[i] = ler.nextInt();
            
            System.out.print("Pares até " + a[i] + ": ");

            for (ii = 0;ii <= a[i]; ii++) {
                if (ii % 2 == 0) {
                    System.out.print(ii + " ");
                    
                }
            }
            System.out.println(" ");

            
        }
	}
}
