package Questão7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Professor professores[] = new Professor[10];
		Aluno alunos[] = new Aluno[10];
		Scanner in = new Scanner(System.in);

		int op = 0;
		while (op != 5) {
			System.out.println("				MENU				");
			System.out.println("1	Cadastrar Professor				.");
			System.out.println("2	Cadastrar Aluno					.");
			System.out.println("3	Visualizar Professor			.");
			System.out.println("4	Visualizar Aluno				.");
			System.out.println("5	Procurar professor por titulação.");
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

			else if (op == 5) {
				int op2 = 0;
				int titu = 0;
				while (op2 != 1) {
					System.out.println("				MENU				");
					System.out.println("Escreva a titulação do professor");
					System.out.println("ESPECIALISTA = 1\r\n" + "MESTRE = 2\r\n" + "DOUTOR = 3.");
					titu = in.nextInt();
					if (titu == 1 || titu == 2 || titu == 3) {
						op2 = 1;
					}
				}
				imprimirBusca(buscaProfessores(professores, titu));
			}
		}
	}

	static Professor[] buscaProfessores(Professor professores[], int titulacao) {
		Professor[] aux = new Professor[professores.length];
		for (int i = 0; i < professores.length; i++) {
			if (professores[i].titulacao == titulacao) {
				aux[i] = professores[i];
			} else {
				aux[i] = new Professor();
			}
		}
		return aux;
	}

	public static void imprimirBusca(Professor[] professores) {
		for (int i = 0; i < professores.length; i++) {
			if (professores[i].nome != null) {
				System.out.println("-- ");
				System.out.println("Nome: " + professores[i].nome);
				System.out.println("Idade: " + professores[i].idade);
				System.out.println("CPF: " + professores[i].cpf);
				System.out.println("Titulação: " + professores[i].cpf);
				System.out.println("-- ");
			}
		}
	}
}
