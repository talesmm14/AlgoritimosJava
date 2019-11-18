package Questão8;

import Questão8.Aluno;

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
	}
}
