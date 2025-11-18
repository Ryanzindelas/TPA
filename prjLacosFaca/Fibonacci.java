package prjLacosFaca;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
    Scanner ler = new Scanner (System.in);
   
   int n, a=1, b=1, prox, i=1;
   
   System.out.println("escreva o numero da sequencia de fibonacci que você quer: ");
   n = ler.nextInt();
   
  
   
   while (i<=n) {
	   prox = a + b;
	   System.out.print(a+" ");
	   a=b;
	   b=prox;
	   i++;
   }
	ler.close();
	}

}
