package Questão9;

import Questão9.Aluno;

public class main {
	public static void main(String[] args) {
		Aluno alunos [] = new Aluno[10];
		Aluno aluno = new Aluno();
		
		// Ler dados dos Alunos
		for (int i = 0; i < alunos.length; i++) {
			Aluno al = new Aluno();
			al.lerAluno();
			alunos[i] = al;
		}
		
		//Imprimir dados dos Alunos
		aluno.imprimir(alunos);
		System.out.println("		Media da Turma!!		");
		mediaTurma(alunos);
	}
	
	public static float mediaTurma(Aluno alunos []) {
		float media = 0;
		for (int i = 0; i < alunos.length; i++) {
			media += alunos[i].media(alunos[i].notaA1, alunos[i].notaA2);
		}
		return media/alunos.length;
	}
}
