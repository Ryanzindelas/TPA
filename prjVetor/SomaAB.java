package prjVetor;

import java.util.Scanner;

public class SomaAB {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], c[],i;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		
		
		for (i=0;i<TAM;i++) {
			System.out.println("digite o "+(i+1)+".o numero: ");
			a[i] = ler.nextInt();
		}
		
		
		for (i=0;i<TAM;i++) {
			System.out.println("digite o "+(i+1)+".o numero: ");
			b[i] = ler.nextInt();
		}

		
		System.out.println("as somas de ");
		System.out.print("a = [");
		for (i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		
		
		System.out.println(" ");
		
		
		System.out.print("b = [");
		for (i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
		System.out.println(" ");
		
		System.out.println("são: ");
		
		System.out.print("c = [ ");
		
		for (i=0;i<TAM;i++) {
			
			c[i] = a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		
		System.out.print("]");

		ler.close();
		
		}

	}

