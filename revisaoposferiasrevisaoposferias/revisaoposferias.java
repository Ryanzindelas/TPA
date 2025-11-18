package revisaoposferias;

import java.util.Scanner;

public class revisaoposferias {

	public static void main (String args[] ) {
	Scanner ler = new Scanner(System.in);
	int nota_um, nota_dois,nota_tres, nota_quatro, media, nota_exame, mediaExame;
	
	System.out.println("escreva sua nota 1: ");
	nota_um = ler.nextInt();
	
	System.out.println("escreva sua nota 2: ");
	nota_dois = ler.nextInt();
	
	System.out.println("escreva sua nota 3: ");
	nota_tres = ler.nextInt();
	
	System.out.println("escreva sua nota 4: ");
	nota_quatro = ler.nextInt();
	
	media = (nota_um + nota_dois + nota_tres + nota_quatro)/4;
	
	if (media >= 7) {
		System.out.println("aprovado,"+" sua media é: "+media);
	} else if (media < 3) {
		System.out.println("reprovado,"+" sua media é: "+media);
	} else 
		System.out.println("sua media é: "+media+", você está em exame, envie outra nota:");
	nota_exame = ler.nextInt();
	mediaExame = (media + nota_exame)/2;
		if(mediaExame >= 7) {
			System.out.println("aprovado,"+" sua nova media é: "+mediaExame);
		} else {
			System.out.println("reprovado,"+" sua nova media é: "+mediaExame);
		}
		ler.close();
	}

}