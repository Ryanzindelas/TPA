package prjAtivadeDecisao;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double c, f;
		
		System.out.println("digite quantos fahrenheit estâo");
		f = ler.nextDouble();
		
		c = (f - 32) / 1.8;
		
		if (c<15) {
			System.out.println("esta frio");
		} else if (c<22) {
			System.out.println("esta ameno");
		} else {
			System.out.println("esta calor");
		}
				
	}

}
