package meu_projeto;
import java.util.Scanner;

public class ConverterMoeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Conversor de Moedas");
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade em Reais: ");
		float valorReais = sc.nextFloat();
		System.out.println("A quantidade em Reais, digitada foi: R$"+valorReais);
		System.out.print("A conversão para Dolar, é: R$"+valorReais/5.08);
		
		sc.close();
		
	}

}
