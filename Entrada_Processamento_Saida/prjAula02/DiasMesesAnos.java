package prjAula02;
import java.util.Scanner;
public class DiasMesesAnos {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia, mes, ano;
		
		System.out.println("digite o numero de dias");
		dia = ler.nextInt();
		
		mes = dia/30;
		ano = mes/12;
		System.out.println("esse numero de dias em meses é "+mes+" e em anos é "+ano);
	}

}
