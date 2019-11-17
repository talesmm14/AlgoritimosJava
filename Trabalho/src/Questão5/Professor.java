package Questão5;

import java.util.Scanner;

public class Professor {
	String nome;
	int idade;
	String cpf;
	Scanner in = new Scanner(System.in); 
	
	public void lerDados() {
		System.out.println("Digite o nome: ");
		nome = in.next();
		System.out.println("Digite a idade: ");
		idade = in.nextInt();
		System.out.println("Digite o CPF: ");
		cpf = in.next();
	}
	
	public static void imprimirDados(Professor professor) {
			System.out.println("-- ");
			System.out.println("Nome: " + professor.nome);
			System.out.println("Idade: " + professor.idade);
			System.out.println("CPF: " + professor.cpf);
			System.out.println("-- ");
	}
}
