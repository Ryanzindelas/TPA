package prj15atividadesVetor;

import java.util.Scanner;

public class Ex7_fatorialB {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        int a[], b[], i, j, result;

        final int TAM = 3;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.print("Digite A[" + i+1 + "]: ");
            a[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {

            result = 1;
            //se a[i] for menor que 0 ent B = 0
            if (a[i] < 0) {  
                b[i] = 0;
            }
            //se não, vai multiplicando do numero a[] pelo contador j até 1.
            else {
                for (j = a[i]; j > 0; j--) {
                    result = result * j;
                }
                b[i] = result;
            }
        }

        
        //apresentar resultados
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
