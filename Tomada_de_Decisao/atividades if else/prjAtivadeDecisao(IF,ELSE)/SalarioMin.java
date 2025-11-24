package prjAtivadeDecisao;
import java.util.Scanner;

public class SalarioMin {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salarioMin, salario;
		
		salarioMin = 1302;
		System.out.println("escreva o seu salario:   ");
		salario = ler.nextDouble();
		
		if(salario < salarioMin) {
			System.out.println("está abaixo do salario minimo");
		}
		else {
			System.out.println("está acima do salario minimo");
		}
				
		
	}

}
