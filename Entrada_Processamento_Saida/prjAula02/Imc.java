package prjAula02;
import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
				double peso, altura, imc;
				
				System.out.println("escreva o seu peso");
				peso = ler.nextDouble();
				
				System.out.println("escreva a sua altura");
				altura = ler.nextDouble();
				
				imc = peso/altura;
						System.out.println("o seu imc é " + imc);
	}

}
