package prjLacosFaca;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		double f1=0, f2=0, f3=0, f4=0, f5=0, i=1,idade, tudo;
	Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("digite a idade");
			idade = ler.nextInt();
			
			if(idade<16) {
				f1++;
			} else 
				if(idade<31) {
					f2++;
				} else
					if (idade<46) {
						f3++;
					}else
						if (idade<61) {
							f4++;
						}else {
							f5++;
						}
			
			System.out.println("você quer continuar? 1-sim, 2-não ");
			i=ler.nextInt();
					
			
				
		}while(i==1);
		
		tudo = f1+f2+f3+f4+f5;
		System.out.println(tudo);
		
		System.out.println(f1+" pessoas estão na faixa 1");
		
		System.out.println(f2+" pessoas estão na faixa 2");
		
		System.out.println(f3+" pessoas estão na faixa 3");
		
		System.out.println(f4+" pessoas estão na faixa 4");
		
		System.out.println(f5+" pessoas estão na faixa 5");
		
		System.out.println("em porcentagem: ");
		
		System.out.println(((f1/tudo)*100)+"% estão na faixa 1");
		
		System.out.println(((f2/tudo)*100)+"% estão na faixa 2");
		
		System.out.println(((f3/tudo)*100)+"% estão na faixa 3");
		
		System.out.println(((f4/tudo)*100)+"% estão na faixa 4");
		
		System.out.println(((f5/tudo)*100)+"% estão na faixa 5");
		
		System.out.println("programa finalizado");
		
		
		
		
        
        
ler.close();
	}

}
