package Questão9;

import java.util.Scanner;

public class Aluno {
	String nome;
	String disciplina;
	float notaA1;
	float notaA2;
	Scanner in = new Scanner(System.in); 
	
	public float media(float A1, float A2) {
		return ((A1 + A2)/2);
	}
	
	public String aprovado(Aluno aluno) {
		if(aluno.media(aluno.notaA1, aluno.notaA2) >= 7) {
			return "Aprovado!!";
		}
		return "Reprovado!!";
	}
	
	public void imprimir(Aluno [] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("-- ");
			System.out.println("Nome: " + alunos[i].nome);
			System.out.println("Disciplina: " + alunos[i].disciplina);
			System.out.println("Media: " + media(alunos[i].notaA1, alunos[i].notaA2));
			System.out.println("Situação: " + aprovado(alunos[i]));
			System.out.println("-- ");
		}
	}
	
	public void lerAluno() {
		System.out.println("Digite o nome: ");
		nome = in.next();
		System.out.println("Digite a Disciplina: ");
		disciplina = in.next();
		System.out.println("Digite a Nota A1: ");
		notaA1 = in.nextFloat();
		System.out.println("Digite a Nota A2: ");
		notaA2 = in.nextFloat();
	}
}
