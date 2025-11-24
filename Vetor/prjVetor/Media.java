package prjVetor;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b=0,  i;
		a = new int[10];
		
		for (i=0;i<TAM;i++) {
			System.out.println("digite o "+(i+1)+"valor pra fazer a média");
			a[i] = ler.nextInt();
		}
		
		System.out.println(" ");
		
		for (i=0;i<TAM;i=i++) {
		b = b + a[i];
		}
		
		System.out.println("a media é: "+b/TAM);
		
		
		ler.close();
	}
	
}
