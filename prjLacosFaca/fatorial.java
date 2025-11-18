package prjLacosFaca;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i, r;
	
	System.out.println("digite o numero que vc quer fatorial: ");
	r = ler.nextInt();
	
	i=r-1;
	
	do {
		
		r = (r*i) ;
				
		i--;
		
		
	}while (i>0);

	System.out.println(r);
	
	ler.close();
	}
	
}
