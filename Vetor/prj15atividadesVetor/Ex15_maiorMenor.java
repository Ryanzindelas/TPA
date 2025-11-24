package prj15atividadesVetor;

import java.util.Scanner;

public class Ex15_maiorMenor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        int a[], b[], c[], i;

        final int TAM = 10;

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];
        
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o número da sua sequencia A.");
            a[i] = ler.nextInt();
            
            System.out.println("Digite o número da sua sequencia B.");
            b[i] = ler.nextInt();
            
            c[i] = 0;
            
            
            //testes
            if (a[i]>b[i]) {
            	c[i] = 1;
            } else if (a[i] == b[i]) {
            	c[i] = 0;
            } else {
            	c[i] = -1;
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

        System.out.print("C = (");
        for (i = 0; i < TAM; i++) {
            System.out.print(c[i]);
            if (i < TAM - 1) System.out.print(", ");
        }
        System.out.println(")");

	}

}
