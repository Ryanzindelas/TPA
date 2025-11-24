import java.util.Scanner;
public class LucroProduto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double preco,qtVendida,precoVenda,lucro;
		
		System.out.println("digite o preço do produto:");
		preco = ler.nextDouble();
		
		System.out.println("digite a quantidade vendida:");
		qtVendida = ler.nextDouble();
		
		System.out.println("digite o preço de venda do produto:");
		precoVenda = ler.nextDouble();
		
		lucro = (preco-precoVenda)*qtVendida;
		
		System.out.println("o lucro foi de: " + lucro);
		ler.close();
				
	}

}
