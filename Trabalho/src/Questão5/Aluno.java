package Questão5;

import java.util.Scanner;

public class Aluno {
	String nome;
	int idade;
	String matricula;
	Scanner in = new Scanner(System.in); 
	
	public void lerDados() {
		System.out.println("Digite o nome: ");
		nome = in.next();
		System.out.println("Digite a idade: ");
		idade = in.nextInt();
		System.out.println("Digite a matricula: ");
		matricula = in.next();
	}
	
	public static void imprimirDados(Aluno aluno) {
			System.out.println("-- ");
			System.out.println("Nome: " + aluno.nome);
			System.out.println("Idade: " + aluno.idade);
			System.out.println("Matricula: " + aluno.matricula);
			System.out.println("-- ");
	}
}
