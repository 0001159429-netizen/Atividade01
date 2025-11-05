package atividade01.atividade02;
import java.util.Scanner;

public class vetores4 {
    public static void main(String[] args) {
        System.out.println("=== Mostrar menor e maior valor de um vetor ===");

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int [10];
        int maiorNumero, menorNumero;

        for ( int i = 0; i <10; i++){
            System.out.println("Digite o " + (i+1) + " numero");
            numeros[i] = sc.nextInt();
        }

        maiorNumero = numeros[0];
        menorNumero = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
            else if ( numeros[i] < menorNumero){
                menorNumero = numeros[i];
            }
        }

        System.out.println("O menor numero digitado foi: " + menorNumero);
        System.out.println("O maior numero digitado foi " + maiorNumero);

        sc.close();
    }
}
