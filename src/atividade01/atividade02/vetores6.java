package atividade01.atividade02;
import java.util.Scanner;

public class vetores6 {
    public static void main(String[] args) {
        System.out.println("=== Vetor Em Ordem Inversa ===");

        Scanner sc = new Scanner(System.in);

        int[] numero = new int[8];

        for ( int i = 0; i < 8; i++){
            System.out.println("Digite o " + (i+1) + " numero: ");
            numero[i] = sc.nextInt();
        }

        //Exibindo em ordem inversa

        System.out.println("Numeros Digitados em Ordem Inversa: ");

        for ( int i = numero.length - 1; i >= 0; i--){
            System.out.println(numero[i]);
        }

        sc.close();

    }
}
