package atividade01.atividade02;
import java.util.Scanner;

public class vetores1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        // leitura dos números

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n=== Números digitados ===");

        // exibição dos números
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        sc.close();

    }
}
