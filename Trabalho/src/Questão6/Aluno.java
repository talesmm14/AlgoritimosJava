package Questão6;

import java.util.Scanner;

public class Aluno {
	String nome;
	int idade;
	String matricula;
	Scanner in = new Scanner(System.in); 
	
	public void lerAluno() {
		System.out.println("Digite o nome: ");
		nome = in.next();
		System.out.println("Digite a idade: ");
		idade = in.nextInt();
		System.out.println("Digite a matricula: ");
		matricula = in.next();
	}
	
	public static void imprimir(Aluno[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("-- ");
			System.out.println("Nome: " + alunos[i].nome);
			System.out.println("Idade: " + alunos[i].idade);
			System.out.println("Matricula: " + alunos[i].matricula);
			System.out.println("-- ");
		}
	}
}
