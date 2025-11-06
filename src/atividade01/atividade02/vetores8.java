package atividade01.atividade02;
import java.util.Scanner;

public class vetores8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] dobro = new int[5];

        System.out.println("Digite 5 números inteiros:");

        // leitura dos números e cálculo do dobro
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            dobro[i] = numeros[i] * 2;
        }

        // exibição dos dois vetores lado a lado
        System.out.println("\nNúmero | Dobro");
        System.out.println("----------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("   " + numeros[i] + "    |   " + dobro[i]);
        }

        sc.close();
    }
}
