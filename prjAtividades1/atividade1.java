package prjAtividades1;
import java.util.Scanner;
public class atividade1 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
	    double nota1, nota2, nota3, nota4, media;
	    
	    System.out.println("coloque a primeira nota:");
	    nota1 = ler.nextDouble();
	    
	    System.out.println("coloque a segunda nota:");
	    nota2 = ler.nextDouble();
	    
	    System.out.println("coloque a terceira nota:");
	    nota3 = ler.nextDouble();
	    
	    System.out.println("coloque a quarta nota:");
	    nota4 = ler.nextDouble();
	    
	 media = (nota1 + nota2 + nota3 + nota4)/4;
	
	    System.out.println("sua media é: "+media);
	    
	    ler.close();
	}

}
