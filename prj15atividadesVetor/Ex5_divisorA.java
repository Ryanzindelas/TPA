package prj15atividadesVetor;

import java.util.Scanner;

public class Ex5_divisorA {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

        final int TAM = 10;
        int a[], nume, i, j;

        a = new int[TAM];


        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i+1) + "º elemento:");
            a[i] = ler.nextInt();
        }

        System.out.println();


        for (i = 0; i < TAM; i++) {

            nume = a[i]; 

            System.out.print(nume + ": ");

            for (j = 1; j <= nume; j++) {
                if (nume % j == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println("\n");
        }

        ler.close();
        }
	}

