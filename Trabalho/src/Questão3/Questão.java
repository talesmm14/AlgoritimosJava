package Quest�o3;

import java.util.Scanner;

public class Quest�o {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int vetorR[] = new int[5];

        // INICIALIZA��O DOS DOIS VETORES
        System.out.println("DIGITE 10 N�MEROS DO VETOR A:");
        for (int i = 0; i < vetorR.length; i++) {
            vetorA[i] = leitor.nextInt();
        }
        System.out.println("DIGITE 10 N�MEROS DO VETOR B:");
        for (int i = 0; i < vetorR.length; i++) {
            vetorB[i] = leitor.nextInt();
        }
        // VERIFICA��O DOS N�MEROS PRESENTEM EM B E N�O EM A
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
