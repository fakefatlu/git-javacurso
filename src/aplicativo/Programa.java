package aplicativo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
	
	
	 System.out.println("Olá, bom dia meu amigo.");
	 System.out.println("Qual o seu nome: ");
	 nome = sc.nextLine();
	 
	 
	 System.out.println("Nome do cliente: " + nome);
	 
	sc.close();
	}

}
