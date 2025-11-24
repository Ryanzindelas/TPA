package prjAtividades2;
import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		Scanner ler= new Scanner (System.in);
		
		int idade, anoNasc,anoAtual;
		
		System.out.println("digite o ano atual");
		anoAtual= ler.nextInt();
		System.out.println("digite seu ano de nascimento");
		anoNasc= ler.nextInt();
		
		idade= anoAtual - anoNasc;
		
		if (idade >= 60) {
        System.out.println("voce tem "+idade+" e � "+"idoso");
		} else if (idade >= 18){
		 System.out.println("voce tem "+idade+" e � "+"adulto");
		} else if(idade>=10){
		 System.out.println("voce tem "+idade+" e � "+"adolescente");
		}else{System.out.println("voce tem "+idade+" e � "+"crian�a");
		
		}
		ler.close();
}
}
		