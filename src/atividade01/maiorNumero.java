package atividade01;
import java.util.Scanner;

public class maiorNumero {
    static void main(String[] args) {

        System.out.println("=== Maior Numero entre dois===");

        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int b = sc.nextInt();

        int maiorNumero = Math.max(a, b);

        System.out.println("O maior número é: " + maiorNumero);

        sc.close();

    }
}
