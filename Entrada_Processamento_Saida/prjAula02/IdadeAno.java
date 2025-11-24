package prjAula02;
import java.util.Scanner;
public class IdadeAno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	int anoNasc, anoAtual, idade;
	
	System.out.println("digite o seu ano de nascimento: ");
	anoNasc = ler.nextInt();
	
	System.out.println("digite o ano atual: ");
	anoAtual = ler.nextInt();
	
	idade = anoAtual - anoNasc;
	
	System.out.println("sua idade é "+idade);
	}

}
