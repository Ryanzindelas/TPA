package prjVetor;

import java.util.Scanner;

public class ABaoQuadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	final int TAM = 10;
		
	int a[], b[], i;
	
	a = new int[TAM];
	b = new int[TAM];
	
	
	
	for (i=0;i<TAM;i++) {
		System.out.println("digite o "+(i+1)+".o numero: ");
		a[i] = ler.nextInt();
	}
	
	System.out.println("os numeros ");
	
	System.out.print("a = [");
	for (i=0;i<TAM;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.print("]");
	
	System.out.println(" ");
	
	System.out.println("ao quadrado são:");
	System.out.print("b = [ ");
	
	for (i=0;i<TAM;i++) {
		
		b[i] = a[i]*a[i];
		System.out.print(b[i]+" ");
	}
	
	System.out.print("]");

	ler.close();
	
	}

}
