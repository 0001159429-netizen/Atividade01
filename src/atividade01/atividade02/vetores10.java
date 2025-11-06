package atividade01.atividade02;
import java.util.Scanner;

public class vetores10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[10]; // vetor com espaço para todos os valores

        System.out.println("Digite 5 números para o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Vetor 1 - Número " + (i + 1) + ": ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("\nDigite 5 números para o segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Vetor 2 - Número " + (i + 1) + ": ");
            vetor2[i] = sc.nextInt();
        }

        // copia os valores do primeiro vetor
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i];
        }

        // copia os valores do segundo vetor (começando do índice 5)
        for (int i = 0; i < vetor2.length; i++) {
            vetor3[i + vetor1.length] = vetor2[i];
        }

        System.out.println("\nVetor resultante com todos os valores:");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vetor3[i]);
        }

        sc.close();
    }
}
