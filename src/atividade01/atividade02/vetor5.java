package atividade01.atividade02;
import java.util.Scanner;

public class vetor5 {
    public static void main(String[] args) {
        System.out.println("=== numeros impares e pares em um vetor ===");

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int par = 0;
        int impar = 0;

        System.out.println("Digite 10 numeros:");

        for ( int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + " numero:");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("A quantidade de numeros pares é: " + par);
        System.out.println("A quantidade de numeros impares é: " + impar);

    }
}
