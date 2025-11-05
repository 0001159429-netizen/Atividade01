package atividade01.atividade02;
import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args) {
        System.out.println("=== Peça 5 números inteiros, armazene-os em um vetor e exiba a soma total dos valores ===");

        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[4];
        int soma = 0;


        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + " numero");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.println("A soma dos numeros digitados é: " + soma);

        sc.close();
    }
}
