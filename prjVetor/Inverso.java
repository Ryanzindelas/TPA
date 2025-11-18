package prjVetor;

import java.util.Scanner;

public class Inverso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 4;
		int a[], b[],  i;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0;i<TAM-1;i++) {
			System.out.println("digite o "+i+"valor ");
			a[i] = ler.nextInt();
		}
		
		for (i=TAM;i>0;i=i-1) {
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
		


		
		
		ler.close();
	}
	
}

