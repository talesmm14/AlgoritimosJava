package Questão2;

public class Questão {
	public static void main(String[] args) {
		int[] vetor = { 3, 5, -8, 1, 4, 4, 8, 3, 8, 2, -4, 5, 1, 9, 4, 9, 1, -8, 9, 8, 2, 1, 4, -5, 2, 1, 6, 7, 5, 8 };
		
		
		int[] vet = new int[30];
		for (int i = 0; i < vetor.length; i++) {
			vet[i] = vetor[i];
			for (int j = 0; j < vetor.length; j++) {
				if (vet[i] == vetor[j] && j != i) {
					vet[j] = 0;
				}
			}
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(":" + vetor[i]);
		}
		System.out.println("");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(":" + vet[i]);
		}
	}

}
