package Questão5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Professor professores[] = new Professor[10];
		Aluno alunos[] = new Aluno[10];
		Scanner in = new Scanner(System.in);

		// Recolher dados aluno e professor
		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = new Aluno();
			System.out.println("Digite o nome: ");
			aluno.nome = in.next();
			System.out.println("Digite a idade: ");
			aluno.idade = in.nextInt();
			System.out.println("Digite a matricula: ");
			aluno.matricula = in.next();
			alunos[i] = aluno;
		}
		for (int i = 0; i < professores.length; i++) {
			Professor prof = new Professor();
			System.out.println("Digite o nome: ");
			prof.nome = in.next();
			System.out.println("Digite a idade: ");
			prof.idade = in.nextInt();
			System.out.println("Digite o CPF: ");
			prof.cpf = in.next();
			professores[i] = prof;
		}

		// Imprimir dados dos professores e alunos
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("-- ");
			System.out.println("Nome: " + alunos[i].nome);
			System.out.println("Idade: " + alunos[i].idade);
			System.out.println("Matricula: " + alunos[i].matricula);
			System.out.println("-- ");
		}
		for (int i = 0; i < professores.length; i++) {
			System.out.println("-- ");
			System.out.println("Nome: " + professores[i].nome);
			System.out.println("Idade: " + professores[i].idade);
			System.out.println("CPF: " + professores[i].cpf);
			System.out.println("-- ");
		}
	}
}
