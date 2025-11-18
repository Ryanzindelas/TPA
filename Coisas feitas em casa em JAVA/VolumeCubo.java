import java.util.Scanner;
public class VolumeCubo {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double aresta,volume;
		
		System.out.println("digite a medida das arestas:");
		aresta = ler.nextDouble();
		
		volume = aresta*aresta*aresta;
		
		System.out.println("o volume do cubo é " + volume);
		ler.close();
		
		
	}

}
