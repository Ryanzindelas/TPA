package prjLacos;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		int i=1, r, n;
	Scanner ler = new Scanner(System.in);
	
	n = ler.nextInt();
	
	while (i<=10) {
		r=n*i;
		System.out.println("o resultado de "+n+ " X "+i+" é: "+r);
		i++;
	}
	}
 
}
