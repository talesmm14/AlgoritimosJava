package Questão6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Professor professores[] = new Professor[10];
		Aluno alunos[] = new Aluno[10];
		Scanner in = new Scanner(System.in);

		int op = 0;
		while (op != 4) {
			System.out.println("				MENU				");
			System.out.println("1	Cadastrar Professor				.");
			System.out.println("2	Cadastrar Aluno					.");
			System.out.println("3	Visualizar Professor			.");
			System.out.println("4	Visualizar Aluno				.");
			op = in.nextInt();
			System.out.println(op);

			if (op == 1) {
				for (int i = 0; i < professores.length; i++) {
					Professor prof = new Professor();
					System.out.println("Professor -" + (i + 1));
					prof.lerProfessor();
					System.out.println("	----	");
					professores[i] = prof;
				}
			}

			else if (op == 2) {
				for (int i = 0; i < alunos.length; i++) {
					Aluno aluno = new Aluno();
					System.out.println("Aluno -" + (i + 1));
					aluno.lerAluno();
					System.out.println("	----	");
					alunos[i] = aluno;
				}
			}

			else if (op == 3) {
				Aluno.imprimir(alunos);
			}

			else if (op == 4) {
				Professor.imprimir(professores);
			}
		}
	}
}
