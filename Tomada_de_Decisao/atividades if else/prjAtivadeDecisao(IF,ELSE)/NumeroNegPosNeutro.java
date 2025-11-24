package prjAtivadeDecisao;
import java.util.Scanner;
public class NumeroNegPosNeutro {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("escreva o seu numero");
		numero = ler.nextInt();
		
		if (numero<0) {
			System.out.println("seu numero é negativo");
		} else if (numero==0) {
			System.out.println("seu numero é neutro");
		}else {
			System.out.println("seu numero é positivo");
		}
		ler.close();
		
	}

}
