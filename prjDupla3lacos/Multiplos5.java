package prjDupla3lacos;

public class Multiplos5 {

	public static void main(String[] args) {
	
	int i, b=0;
	
	System.out.println("Os numeros multiplos de 5 do 0 até 400 são: ");
	
	for (i=0 ; i<401 ; i=i+5) {
		System.out.print(i+"+"+b+"=");
		b=i+b;
		System.out.println(b);

		
	}

	}

}
