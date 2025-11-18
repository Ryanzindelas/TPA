package prj15atividadesVetor;

import java.util.Scanner;

public class Ex12_merenda {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,aluno, continuar=0;
		boolean check[]= new boolean[10], existe;
		int senha[] = new int[10];
		
	
		//cria as senhas, syso elas e transforma todos os check em false
		for (i=0; i<10;i++) {
			senha[i] = (int)(Math.random()* 100);
			System.out.println("a senha "+(i+1)+" é: "+senha[i]);
			check[i]= false;
		}
		
		
		
		//while pra continuar ou não no fim do codigo
		while(continuar<1) {
			
		//existe marcado como false pra depois ver se muda ou não
		existe = false;
		
		System.out.println("digite a senha do aluno: ");
		aluno = ler.nextInt();
		
		//FOR pra fazer a "pesquisa" se esse numero está na lista de senhas
		for(i=1;i<10;i++){
			
			//se a senha do aluno for = a senha da vez ent (existe = true) pra saber que é valido
			if(aluno == senha[i]) {
				existe = true;
				
				//como ja é valido, vai checar se ja foi utilizada antes ou se não
				if(check[i]==true) {
					System.out.println("essa senha ja foi utilizada antes.");
				}else {
					check[i] = true;
					System.out.println("essa senha foi utilizada com sucesso!");
				}
			}
		}
		//(fora do laço FOR) se não tiver mudado o existe ent a senha é invalida.
		if(existe == false) {
			System.out.println("senha invalida");
			}
		
		
		System.out.println("deseja continuar? 0-sim 1-não");
		continuar = ler.nextInt();
			}
		
		
	
		
		ler.close();
		
	}

}
