package prj15atividadesVetor;

import java.util.Scanner;

public class Ex6_indexados {

	public static void main(String[] args) {
	    	
	    	Scanner ler = new Scanner(System.in);
	    	
	    	final int TAM = 10;
			
			int a[], i ,ii;
			
			a = new int [TAM];

	        for (i = 0; i<TAM; i++) {
	        	System.out.println("Digite o valor do vetor A");
	        	a[i] = ler.nextInt();
	            
	            System.out.print("Divisores do " + a[i] + ": ");

	            for (ii = 1;ii <= a[i]; ii++) {
	                if (a[i] % ii == 0) {
	                    System.out.print(ii + " ");
	                }
	            }
	            System.out.println(" ");

	       }
	}

}
