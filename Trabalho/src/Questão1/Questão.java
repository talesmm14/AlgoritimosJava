package Questão1;

public class Questão {
	public static void main(String[] args) {
		int vetor[] = new int[20];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
			System.out.print(" :"+ vetor[i]);
		}
		int aux;
		for (int i = 0; i < vetor.length; i+=2) {
			aux = vetor[i];
			vetor[i] = vetor[i+1];
			vetor[i+1] = aux;
		}
		System.out.println(" :");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" :"+ vetor[i]);
		}
	}
}
