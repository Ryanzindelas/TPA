package prj15atividadesVetor;

import java.util.Scanner;

public class Ex5_divisorA {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

        final int TAM = 10;
        int a[], num, i, j;

        a = new int[TAM];

        //FOR do vetor(ler)
        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i+1) + "° elemento:");
            a[i] = ler.nextInt();
        }
        
      //FOR do vetor(resposta)
        for (i = 0; i < TAM; i++) {

           num = a[i]; 

            System.out.print(num + ": ");
            
            //vai ver se é divisivel, se for vai printar o numero que é, se não repete até o num
            for (j = 1; j <= num; j++) {
                if (num % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("  ");
        }

     
        ler.close();
        }
	}

