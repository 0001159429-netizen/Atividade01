package atividade01;
import java.util.Scanner;

public class somaAteN {
    public static void main(String[] args) {
        System.out.println("=== Soma de um numero até N ====");
        Scanner sc =  new Scanner (System.in);

        System.out.println("Digite um numero N: ");
        int n = sc.nextInt();

        int soma = 0;

        //soma até N

        for( int i = 1; i <= n; i++){
            soma += i;
        }

        System.out.println("A soma de 1 até " + n + " é " + soma);
    }
}
