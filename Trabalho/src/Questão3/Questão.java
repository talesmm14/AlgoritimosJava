package Questão3;

import java.util.Scanner;

public class Questão {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int vetorR[] = new int[5];

        // Pegando vetores
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorR.length; i++) {
            vetorA[i] = in.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetorR.length; i++) {
            vetorB[i] = in.nextInt();
        }
        // Verificação
        for (int i = 0, j = 0; i < vetorR.length; i++) {
            boolean diferente = true;
            for (int n = 0; j < vetorR.length; j++) {
                if (vetorA[j] == vetorB[i]) {
                    diferente = false;
                }
                if (diferente) {
                    vetorR[j] = vetorB[i];
                    n++;
                } else
                    diferente = true;
            }
            for (int n = 0; n < vetorR.length; n++) {
                System.out.println(vetorR[n]);
            }
        }
    }
}
