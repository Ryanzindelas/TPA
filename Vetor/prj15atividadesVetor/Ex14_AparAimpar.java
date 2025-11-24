package prj15atividadesVetor;

import java.util.Scanner;

public class Ex14_AparAimpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        int a[], b[], i;

        final int TAM = 10;

        a = new int[TAM];
        b = new int[TAM];
        
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o número da sua sequencia A.");
            a[i] = ler.nextInt();
            
        	b[i] = 0;
        	
        	if (a[i] % 2 == 0) {
            	b[i] = 1;
        }
    }
        System.out.print("A = (");
        for (i = 0; i < TAM; i++) {
            System.out.print(a[i]);
            if (i < TAM - 1) System.out.print(", ");
        }
        System.out.println(")");

        System.out.print("B = (");
        for (i = 0; i < TAM; i++) {
            System.out.print(b[i]);
            if (i < TAM - 1) System.out.print(", ");
        }
        System.out.println(")");

	}

}
