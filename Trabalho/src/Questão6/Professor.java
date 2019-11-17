package Questão6;

import java.util.Scanner;

public class Professor {
	String nome;
	int idade;
	String cpf;
	Scanner in = new Scanner(System.in); 
	
	public void lerProfessor() {
		System.out.println("Digite o nome: ");
		nome = in.next();
		System.out.println("Digite a idade: ");
		idade = in.nextInt();
		System.out.println("Digite o CPF: ");
		cpf = in.next();
	}
	
	public static void imprimir(Professor[] professores) {
		for (int i = 0; i < professores.length; i++) {
			System.out.println("-- ");
			System.out.println("Nome: " + professores[i].nome);
			System.out.println("Idade: " + professores[i].idade);
			System.out.println("CPF: " + professores[i].cpf);
			System.out.println("-- ");
		}
	}
}
