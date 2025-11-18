package prj15atividadesVetor;

import java.util.Scanner;

public class Ex6_indexados {

	public static void main(String[] args) {
	    	
	    	Scanner ler = new Scanner(System.in);
	    	
	    	final int TAM = 11;
			
			int a[], i ;
			
			a = new int [TAM];

			//faz o vetor receber o valor respectivo da sua posição
	        for (i = 0; i<TAM; i++) {
	        	a[i] = i;
	        }
	        
	            System.out.print("a = { ");
	            System.out.print("1");
	            for (i = 1;i < TAM; i++) {
	              System.out.print(", "+(int)Math.pow(2, a[i]));
	            }
	            System.out.print(" }");

	       
	}

}
