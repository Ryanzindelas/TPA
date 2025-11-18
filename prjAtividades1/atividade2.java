package prjAtividades1;
import java.util.Scanner;
public class atividade2 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
	    double valorAula,aulasMes, INSS, salarioLiquido;
	    
	    System.out.println("Qual o valor da sua aula?: ");
	    valorAula = ler.nextDouble();
	    
	    System.out.println("Quantas aulas você da no mês?: ");
	    aulasMes = ler.nextDouble();
	    
	    System.out.println("Quanto é o INSS: ");
	    INSS = ler.nextDouble();
	    
	
	    
	 salarioLiquido = (aulasMes*valorAula - (((aulasMes*valorAula)/100)*INSS));
	
	    System.out.println("seu salario liquido é: "+salarioLiquido);
	    
	    ler.close();
	}

}

