package prjAtividades1;
import java.util.Scanner;
public class atividade3 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
	    double valor, taxa, tempo, prestacao;
	    
	    System.out.println("valor original da prestação: ");
	    valor = ler.nextDouble();
	    
	    System.out.println("qual a taxa?:  ");
	    taxa = ler.nextDouble();
	    
	    System.out.println("quantos dias de atraso?:  ");
	    tempo = ler.nextDouble();
	    
	
	    
	    prestacao = valor+(valor *((taxa/100)*tempo));
	
	    System.out.println("O valor da prestação com atraso é: "+prestacao);
	    
	    ler.close();
	}

}

