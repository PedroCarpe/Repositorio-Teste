package meu_projeto;
import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int valorInteiro = teclado.nextInt();
		System.out.print("Digite um numero real: ");
		float valorReal = teclado.nextFloat();
		System.out.print("Você digitou os valores: "+valorInteiro+" e "+valorReal);
		
		teclado.close();
		
	}

}
