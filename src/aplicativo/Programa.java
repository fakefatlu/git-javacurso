package aplicativo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String cidade;
		
		int idade;
		
	 System.out.println("Olá, bom dia meu amigo.");
	 System.out.println("Qual o seu nome: ");
	 nome = sc.nextLine();
	 System.out.println("Idade: ");
	 idade = sc.nextInt();
	 sc.nextLine();
	 System.out.println("Cidade natal: ");
	 cidade = sc.nextLine(); 
	 System.out.println("-----------------------------");
	 System.out.println("Nome do cliente: " + nome);
	 System.out.println("Idade: " + idade + " anos");
	 System.out.println("Cidade natal: " + cidade);
	sc.close();
	}
}
