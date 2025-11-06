package atividade01.atividade02;
import java.util.Scanner;

public class vetores9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");

        // leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros positivos digitados:");

        // exibição apenas dos positivos
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
