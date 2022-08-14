package meu_projeto;
import java.util.Scanner;

public class DiversasLeituras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Meu nome é: "+nome);
		
		System.out.print("Digite sua idade: ");
		String idade = sc.nextLine();
		System.out.println("Minha idade é: "+idade);
		
		System.out.print("Profissão: ");
        String profissao = sc.nextLine();
        System.out.println("Sua profissão é: "+profissao);
        
        System.out.print("Escolaridade: ");
        String escolaridade = sc.next();
        System.out.print("Minha escolaridade é: "+escolaridade);
		
		
		
		sc.close();
		
	}

}
