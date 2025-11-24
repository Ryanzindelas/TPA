package prjAula02;
import java.util.Scanner;

public class ValoresInvertidos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("leia o valor de  primeiro valor:");
		a = ler.nextInt();
		
		System.out.println("leia o segundo valor:");
		b = ler.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(" os valores invertidos são: "+ a+"  "+ b);
		ler.close();
		
		
	}

}
