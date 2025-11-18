package prj15atividadesVetor;

import java.util.Scanner;

public class Ex3_Primo {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);

	        final int TAM = 10;

	        int i, num, check, teste;
	        int[] A = new int[TAM];


	        for (i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i+1) + " valor:");
	            A[i] = ler.nextInt();
	        }
	       
	        //FOR do vetor
	        for (i = 0; i < TAM; i++) {

	            num = A[i];
	            check= 0;
	            // se o numero for igual ou menor q 1 = não é primo
	            if (num <= 1) {
	                System.out.println( num + " Não é primo");
	            } 
	            
	            else {
	            	//enqnt teste for menor do q o numero ele vai ir testando todas as divisões. se for divisivel = n é primo.
	                for (teste = 2; teste < num; teste++) {
	                    if (num % teste == 0) {
	                        check = check + 1; 
	                    }
	                }
	                
	                //se não for divisivel por nenhum outro numero ate ele = é primo.
	                if (check == 0) {
	                    System.out.println( num + " É primo");
	                } else {
	                    System.out.println(  num + " Não é primo");
	                }
	                
	            }
	           
	            ler.close();
        }
	}
}
