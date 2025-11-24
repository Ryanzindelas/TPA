package prjLacosFaca;

public class Altura {

	public static void main(String[] args) {
	double i=1,joao=134, pedro=145;
	
	do {
		joao= joao+2.5;
		pedro = pedro+2;
		i++;
	}while (pedro >= joao);

	System.out.println("vai demorar "+i+" anos para joão se maior que pedro.");
	}

}
