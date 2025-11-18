package prjAula02;
import java.util.Scanner;

public class AreaDoTriangulo {
      public static void main (String[] args) {
    	  Scanner ler = new Scanner(System.in);
    	  
    	  double base, altura, area;
    	  System.out.println("digite o valor da base do triangulo:");
    	  base = ler.nextDouble();
    	  
    	  System.out.println("digite o valor da altura do tringulo:");
    	  altura = ler.nextDouble();
    	  
    	  area = (base*altura)/2;
    	  System.out.println("a area do triangulo é "+ area);
    	  ler.close();
    	  
      }
}