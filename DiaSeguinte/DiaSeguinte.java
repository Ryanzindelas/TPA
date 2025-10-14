package prjExDiaSeguinte;

import java.util.Scanner;

public class DiaSeguinte {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int dia, mes, ano, limiteMes, i=10;
	
	do {
		System.out.println("digite o dia: XX/xx/xxxx");
		dia = ler.nextInt();
	 
		System.out.println("digite o mês: "+dia+"/XX/xxxx");
		mes = ler.nextInt();
	 
		System.out.println("digite o ano: "+dia+"/"+mes+"/XXXX");
		ano = ler.nextInt();
		
		
		System.out.println("o dia é "+dia+"/"+mes+"/"+ano);
	
		switch(mes) {
		
		//Meses com 31 dias
		case 1:
		case 3:	
		case 5:
		case 7:	
		case 8:
		case 10:	
			limiteMes = 31;
			//codigo do =1mes
			if(dia > limiteMes) {
				System.out.println("ERRO - esse dia não existe");
			}else
				if(dia == limiteMes) {
					dia = 1;
					mes = mes+1;
				} else {
					dia = dia +1;
				}
			//codigo do =1mes FIM
		break;
		
		
		
		
		
		//ultimo mes (passar de ano)
		case 12:
			limiteMes = 31;
			//codigo do =1mes
			if(dia > limiteMes) {
				System.out.println("ERRO - esse dia não existe");
			}else
				if(dia == limiteMes) {
					dia = 1;
					mes = 1;
					ano = ano+1;
				} else {
					dia = dia +1;
				}
			//codigo do =1mes FIM
		break;
			
		
		
		
		
		//Meses com 30 dias	
		case 4: 
		case 6:
		case 9:	
		case 11:
			limiteMes = 30;
			//codigo do =1mes
			if(dia > limiteMes) {
				System.out.println("ERRO - esse dia não existe");
			}else
				if(dia == limiteMes) {
					dia = 1;
					mes = mes+1;
				} else {
					dia = dia +1;
				}
			//codigo do =1mes FIM
		break;
			
		
		
		
		
		//Meses com 29 ou 28 dias	
		case 2: 
			if (ano % 4 == 0){
				//if
				//codigo do =1mes
				limiteMes = 29;
				if(dia > limiteMes) {
					System.out.println("ERRO - esse dia não existe");
				}else
					if(dia == limiteMes) {
						dia = 1;
						mes = mes+1;
					} else {
						dia = dia +1;
					}
				//codigo do =1mes FIM
				//if
			} else {
				//else
				//codigo do =1mes
				limiteMes = 28;
				if(dia > limiteMes) {
					System.out.println("ERRO - esse dia não existe");
				}else
					if(dia == limiteMes) {
						dia = 1;
						mes = mes+1;
					} else {
						dia = dia +1;
					}
				//codigo do =1mes FIM
				//else
			}
		break;
		}
		
		
		System.out.println("o dia seguinte é: "+dia+"/"+mes+"/"+ano);

	System.out.println("quer continuar 1-sim 2-não");
	i = ler.nextInt();
	}while(i==1);
	
	
	
	ler.close();
	}

}
