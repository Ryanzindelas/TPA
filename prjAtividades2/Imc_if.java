package prjAtividades2;
import java.util.Scanner;
public class Imc_if {
	
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double peso, altura, imc;
		
		System.out.println("escreva seu peso");
		peso = ler.nextDouble();
		
		System.out.println("escreva sua altura em metros");
		altura = ler.nextDouble();
		 imc = peso/(altura * altura);
		if (imc>40) {
			System.out.println("obesidade nivel 3");
		} else if (imc>35) {
			System.out.println("obesidade nivel 2");
			
		} else if (imc>30) {
			System.out.println("obesidade nivel 1");
			
		} else if (imc>25) {
			System.out.println("excesso de peso");
			
		}else if (imc > 18.5) {
			System.out.println("peso normal");
			
	    } else 
			System.out.println("excesso de magreza");
      System.out.println("e seu IMC é: " + imc);
		ler.close();
	}

}
