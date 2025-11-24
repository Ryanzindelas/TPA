import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int salario,inss,vl,sl;
		
		System.out.println("digite o seu salario:");
		salario = ler.nextInt();
		
		inss = (salario*8)/100;
		vl = salario*6/100;
		sl = salario-vl-inss;
		
		System.out.println("O salario liquido, com os descontos é : " + sl);
		ler.close();
		
		
	}
}
